package assignment1;

import java.util.Scanner;

public class hexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        String hexadecimal="";
        char[]hexchar={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int reminder;
        while(decimal>0)
        {
             reminder=decimal%16;
             hexadecimal=hexchar[reminder]+hexadecimal;
             decimal=decimal/16; 
        }
        System.out.println(hexadecimal);
    }
    
}
