package assignment1;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=n/2;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<m;i++)
        {
          System.out.print(arr[i]+" ");
        }
       for(i=n-1;i>=m;i--)
        {
           System.out.print(arr[i]+" ");
     }
        
    }
    
}
