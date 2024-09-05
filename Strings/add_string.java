package Strings;

import java.util.Scanner;


public class add_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str1=sc.next();
        System.out.println("enter the string:");
        String str2=sc.next();
        StringBuffer s=new StringBuffer();
        int carry=0,i,j;
        for(i=str1.length()-1,j=str2.length()-1;i>=0||j>=0;i--,j--)
        {
           int x=(i<0)?0:str1.charAt(i)-'0';
           int y=(j<0)?0:str2.charAt(j)-'0';
           s.append((x+y+carry)%10);
           carry=(x+y)/10;

        } 
        if (carry > 0) {
            s.append(carry);
        }
        s.reverse();
        String str=s.toString();
        System.out.println(str);
    }
     
}
