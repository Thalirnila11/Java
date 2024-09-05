package Strings;

import java.util.Scanner;

public class reversevowel {
   

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuffer str=new StringBuffer(s);
        System.out.println(ReverseString(str));
    }
    public static StringBuffer ReverseString(StringBuffer str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
            if("aeiouAEIOU".indexOf(str.charAt(i))!=-1)
            {
                if("aeiouAEIOU".indexOf(str.charAt(j))!=-1)
                {
                    char temp=str.charAt(i);
                    str.setCharAt(i, str.charAt(j));
                    str.setCharAt(j, temp);
                    i++;
                    j--;
                }
                j--;
            }
            else
            {
                i++;
            }
        return str;
    }
         
}
    
