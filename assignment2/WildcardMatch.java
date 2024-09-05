package assignment2;

import java.util.Scanner;

public class WildcardMatch {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter thr string: ");
       String s=sc.next();
       System.out.print("enter the pattern: ");
       String pattern=sc.next();
       System.out.println(match(s,pattern));
   }
   public static boolean match(String s,String pattern)
   {
    boolean dp[][]=new boolean[pattern.length()][s.length()];
    dp[0][0]=true;
    for(int j=1;j<pattern.length();j++)
    {
       if(pattern.charAt(j)=='*')
       {
        dp[0][j]=dp[0][j-1];
       }
    }
    for(int i=1;i<s.length();i++)
    {
        for(int j=1;j<pattern.length();j++)
        {
            if(s.charAt(i)==pattern.charAt(j)||pattern.charAt(j)=='?')
            {
                dp[i][j]=dp[i-1][j-1];
            }
            else if(pattern.charAt(j)=='*')
            {
             dp[i][j]=dp[i][j-1]||dp[i-1][j];   
            }
        }
    }
    return dp[s.length()-1][pattern.length()-1];
   }
}