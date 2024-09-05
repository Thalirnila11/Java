package arrays;

import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            if(check(i,n1,n2))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean check(int i,int n1,int n2)
    {
        while(i!=0)
        {
            int rem=i%10;
            if(rem!=n1 && rem!=n2){
                return false;
            }
            i=i/10;
        }
        return true;
        
    }
}
    
