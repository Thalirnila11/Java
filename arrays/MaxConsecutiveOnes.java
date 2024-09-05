package arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=0,r=0,max=0,zero=0;
        while(r<arr.length)
        {
            if(arr[r]==0)
            {
              zero++;
            }
            while(zero>k)
            {
                if(arr[l]==0)
                {
                    zero--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
                }
                System.out.println(max);
    }
}
