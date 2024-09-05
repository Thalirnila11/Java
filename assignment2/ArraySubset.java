package assignment2;


import java.util.Scanner;

public class ArraySubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]={3,2,1,4,6};
        int arr2[]={3,2,1};
        boolean flag=true;
        for(int i=0;i<arr2.length;i++)
        {
            boolean found=false;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                   found=true;
                   break;
                }
                
            }
            if(!found)
            {
                  flag=false;
                  break;
            }
           
        }
        if(flag)
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false"); 
        }
    }
}