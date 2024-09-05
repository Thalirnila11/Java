package Strings;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S1=sc.next();
        String Substring=sc.next();
        System.out.print(SubString(S1,Substring));
    }
    public static boolean SubString(String S1,String Substring)
    {
        int i=0,j=0;
        boolean flag=false;
        while(i<Substring.length()&&j<S1.length())
        {
            if(Substring.charAt(i)==(S1.charAt(j)))
            {
                flag=true;
                i++;
                j++;
            }
            else{
                flag=false;
                j++;
            }
        }
        return flag;
    }
}
