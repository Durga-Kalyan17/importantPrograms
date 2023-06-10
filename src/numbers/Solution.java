package numbers;

class Solution {
    public static void romanToInt(String s) {
        char [] ch = s.toCharArray();
        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='I')
            	sum += 1;
            else if(ch[i]=='V')
            	sum += 5;
            else if(ch[i]=='X')
            	sum += 10;
            else if(ch[i]=='L')
            	sum += 50;
            else if(ch[i]=='C')
            	sum += 100;
            else if(ch[i]=='D')
            	sum += 500;
            else if(ch[i]=='M')
            	sum += 1000;	
        }
        System.out.println(sum);
    }
    
    public static void main(String [] arga)
    {
    	Solution.romanToInt("MCMXCIV");
    }
}
