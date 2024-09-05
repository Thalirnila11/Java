package Strings;
import java.util.Scanner;
public class RansomNote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ransom=sc.next();
        String magazine=sc.next();
        System.out.print(ransom_note(ransom,magazine));
    }
    public static boolean ransom_note(String s1,String s2)
    {
        int i=0,j=0;
        boolean flag=false;
        while(i<s1.length()&&j<s2.length())
        {
            
            if(s1.charAt(i)==s2.charAt(j))
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
