package assignment1;

import java.util.Scanner;

public class algexp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'||str.charAt(i)=='(')
            {
                continue;
            }
            else{
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    
}
