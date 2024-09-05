package arrays;

import java.util.Scanner;

public class guest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int entry[]=new int[n];
        int leave[]=new int[n];
        int i,max=0,guest = 0;
        for(i=0;i<n;i++)
        {
            entry[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            leave[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            guest += entry[i]-leave[i];
             max=Math.max(max,guest);
        }
        System.out.println(max);
    }
    
}
