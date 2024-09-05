package dynamic_programming;

import java.util.Scanner;

public class ferquency_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
         for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
         }
         int dp[]=new int[n];
         for(int i=0;i<n;i++)
         {
            if(dp[i]!=-1)
            {
                int count=1;
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        dp[j]=-1;
                    }
                }
                dp[i]=count;
            }
         }
         for(int i=0;i<n;i++)
         {
            if(dp[i]!=-1)
            {
                System.out.print(arr[i]+":"+dp[i]+" ");
            }
         }
}
}