package arrays;

import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double n1=n*n;
        System.out.println(n1);
        double num=n%10;
        double sqrt=n1%10;
        System.out.print("num "+num+"sqrt "+sqrt);
        if(num==sqrt)
        {
            System.out.print("YES");
    }
        else
        {
            System.out.print("NO");
        }

    }
    
}
