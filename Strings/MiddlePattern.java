package Strings;

import java.util.Scanner;

public class MiddlePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int mid=str.length()/2;
        String pattern="";
        int i=mid;
        
        for(int j=0;j<str.length();j++)
        {
               pattern+=str.charAt(i);
               System.out.print(pattern+"$"+" ");
               if(i==str.length()-1)
               {
                i=0;
               }
               else{
                i++;
               }
        }
        System.out.println("");
        String pattern1="";
        for(int j=0;j<str.length();j++)
        {
            pattern1+=str.charAt(mid);
           System.out.print(pattern1+"$"+" "); 
           mid=(mid+1)%str.length();

        }
        
    }
    
}
