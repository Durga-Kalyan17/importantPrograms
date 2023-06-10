package strings;

import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public static boolean wordPattern(String pattern, String s) {
        
        char [] patternCharArr = pattern.toCharArray();
        Set<Character> patternSet = new LinkedHashSet<>();
        int a = patternCharArr.length;
        
        for(Character c: patternCharArr)
            patternSet.add(c);
        
        char []  sCharArr = s.toCharArray();
        Set<String> stringSet = new LinkedHashSet<>();
        int b = sCharArr.length;
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(i<=s.length()/2)
            {
                for(int j=i+1;j<=s.length()/2;j++)
                {
                    if(sCharArr[j] == ' ')
                    {
                        stringSet.add(s.substring(i, j));
                        count++;
                    }     
                }
            }   
            if(i>s.length()/2)
            {
                for(int j=i;j<s.length();j++)
                {
                    if(sCharArr[j] == ' ')
                    {
                        stringSet.add(s.substring(i, j));
                        i = j+1;
                        count++;
                    }
                }
            }   
        }
        if((patternSet.size() == stringSet.size()) && (a == count+1))
        	return true;
        else
        	return false;
    }
    
    public static void main(String[] args) {
		
    	System.out.println(Solution.wordPattern("abba","dog cat cat dog"));
	}
}