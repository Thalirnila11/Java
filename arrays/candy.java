package arrays;

import java.util.Arrays;
import java.util.Scanner;

class candy
{
    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int child[]=new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            child[i]=sc.nextInt();
        }
        int candies[]=new int[n];
        Arrays.fill(candies, 1);

        for(i=1;i<n;i++)
        {
            if(child[i]>child[i-1])
            {
                candies[i]=candies[i-1]+1;
            }
        }
        for(i=n-1;i<0;i--)
        {
            if(child[i]>child[i-1])
            {
                candies[i]=Math.max(candies[i],candies[i-1]+1);
        }
    }
    int sum=0;
    for(int item:candies)
    {
        sum+=item;
    }
    System.out.println(sum);
}
}