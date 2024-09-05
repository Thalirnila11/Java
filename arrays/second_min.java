package arrays;

import java.util.Scanner;

public class second_min {
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.err.println("gyhujk");
        System.out.println(min);
        int min2=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(arr[i]!=min && arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        System.out.print(min2);
    }
}

