package assignment6;

import java.util.Scanner;

public class GoodOrBad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(strclassify(str));
    }
    public static String strclassify(String str)
    {
        int vowelcount=0;
        int consnantcount=0;
        for(int i=0;i<str.length();i++)
        {
            if("aeiou".indexOf(str.charAt(i))!=-1||str.charAt(i)=='?')
            {
                vowelcount++;
                consnantcount=0;
            }
            else
            {
                consnantcount++;
                vowelcount=0;
            }
            if(vowelcount>5||consnantcount>3)

            {
                return "BAD";
            }
        }
        return "GOOD";
    }
    
}
