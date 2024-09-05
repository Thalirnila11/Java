package Strings;

import java.util.Scanner;

public class non_unique {
    public static char findTheDifference(String s, String t) {
        
        int sumS = 0, sumT = 0;
        
        for (char c : s.toCharArray()) {
            sumS += c;
        }
        
        for (char c : t.toCharArray()) {
            sumT += c;
        }

        
        return (char) (sumT - sumS);
    }

    public static void main(String[] args) {
        // Sample inputs
        Scanner sc = new Scanner(System.in);
        
        // Read the input strings
        String s = sc.next();
        String t = sc.next();

        
        
        System.out.println(findTheDifference(s, t)); 

    }
}
