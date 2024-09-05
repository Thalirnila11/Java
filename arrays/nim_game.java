package arrays;

import java.util.Scanner;

public class nim_game {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        if(n<=3)
        {
            System.out.println("true");
        }
        else{
        for(int i=1;i<=n;i++)
        {
          if(k<3)
          {
              
              k++;
          }
            
        }
        System.out.println(k);
        if(k==n)
              {
                  System.out.println("true");
              }
        else
            {
                System.out.println("false");
            }
        }
    }
    
}
