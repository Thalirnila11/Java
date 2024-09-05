package Strings;

import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(non_repeat(str));
    }
    public static int non_repeat(String str)
    {
        int arr[]=new int[26];
        int n=0;
        for(int i=0;i<str.length();i++)
        {
            int index=str.charAt(i)-'a';
            arr[index]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)-'a']==1)
            {
                return i;

            }
        }

       
        return -1;
        
    }
    
}
