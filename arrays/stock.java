package arrays;

import java.util.Scanner;

public class stock {
    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int stock[]=new int[n];
        int i;
        for( i=0;i<n;i++)
        {
            stock[i]=sc.nextInt();
        }
        int max=stock[0];
        int min=stock[0];
        int profit,k;
        for(i=0;i<n;i++)
        {
            min=Math.min(min,stock[i]);
            
        }
        System.out.println(min);
        for(i=0;i<n;i++)
        {
            if(min==stock[i])
            {
                k=i;
                System.out.println(k);
                break;
            }
        }
       
        for(i=k+1;i<n;i++)
        {
            max=Math.max(max,stock[i]);
        }
        System.out.print(max-min);
    
    }
}

    
