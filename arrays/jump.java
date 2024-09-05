package arrays;

import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0,j=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if (j<n){
            j=j+arr[j];
            System.out.println(j);
            }
           
        }
        if(j==n-1)
            {
               System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
    }
    
}
