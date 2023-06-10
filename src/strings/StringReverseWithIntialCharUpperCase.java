package strings;

import java.util.Scanner;

public class StringReverseWithIntialCharUpperCase {
	
	public static void reverseString(String str)
    {
		System.out.println("INPUT : "+str);
		System.out.print("OUTPUT : ");
        int x = 0;
        String a = null, b = null;
        char [] ch = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(ch[i] == ' ')
            {
                a = str.substring(0,i);
                b = str.substring(i,str.length());
            }
        }
      
        char [] ch2 = b.toCharArray();
        for(int k=b.length()-1;k>1;k--)
            System.out.print(ch2[k]);
            
        int z = (int) ch2[x+1];
        z -= 32;
        System.out.print((char)z+" ");
        
        char [] ch1 = a.toCharArray();
        for(int j=a.length()-1;j>0;j--)
            System.out.print(ch1[j]);
            
        int y = (int) ch1[x];
        y -= 32;
        System.out.print((char)y);
    }
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = scan.nextLine();
		
		StringReverseWithIntialCharUpperCase.reverseString(str);

	}

}




