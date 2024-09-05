package assignment3;

import java.util.Arrays;

public class anagram {
    
    public static boolean areAnagrams(String s1, String s2)
    {
        
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

   
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        
    }
}

