package Strings;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        for(int i=0;i<str.length();i++)
        {
            
            
            if("aeiouAEIOU".indexOf(str.charAt(i))!=-1)
            {
                if((i<str.length()-1 && (str.charAt(i)==str.charAt(i+1)))||(i>0&&(str.charAt(i)==str.charAt(i-1))))
                {
                    System.out.print(str.charAt(i)+ "");
                }
                
            }
            else{
                System.out.print(str.charAt(i)+ "");
            }
            
        }

    }
    
}
