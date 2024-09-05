package Strings;

import java.util.Scanner;

public class backsapce {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        StringBuffer sb1 = new StringBuffer(str1);    
        StringBuffer sb2 = new StringBuffer(str2);
        String s1=backspace_str(sb1).toString();
        String s2=backspace_str(sb2).toString();
        if((s1).equals(s2))
        {
            System.out.print("true");
        }
         else
         {
             System.out.print("false");
         }
        
    }
    public static StringBuffer backspace_str(StringBuffer str)
    {
        int i=0;
        while(i<str.length())
        {
            if(str.charAt(i)=='#'&&i>0)
            {
                str.deleteCharAt(i);
                str.deleteCharAt(i-1);
                i--;
            }
            else
            {
                i++;
            }
        }
        return str;
    }
}
    

