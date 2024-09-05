package arrays;

import java.util.Scanner;

public class prime_pair {
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,j,k=0;
        
        
        for (i=2;i<=num;i++)
        {
            for(j=i+1;j<=num;j++)
            {
                if(prime(i)&&prime(j)&&prime(i+j))
                {
                    System.out.println(i+" "+j);
                }
            }
           
        }
    }
        public static boolean prime(int num)
        {
            int i;
            boolean flag=true;
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    flag=false;
                    break;
                }
            }
            
            return flag;
        }
       
    
}
    

    

