package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class evenoddsort {
    public static void reverse(int arr[],int left,int right)
    {
             while(left<right)
             {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
             }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i, temp,j=n-1;
        int arr[]=new int[n];
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int left = 0, right = n - 1;
        
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 != 0) {
                right--;
            } else {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        Arrays.sort(arr,0,left);
        reverse(arr, 0, left-1 );
        Arrays.sort(arr,left,n);
        reverse(arr, left, n-1 );
         
       
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
   

    
}
