package arrays;

import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,temp,j;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int r=sc.nextInt();
        
        for(j=0;j<r%n;j++)
        {
            temp=arr[n-1];
            for(i=n-1;i>0;i--)
            {
              arr[i]=arr[i-1];
            }
            arr[0]=temp;
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        
        }
    }
    
}
