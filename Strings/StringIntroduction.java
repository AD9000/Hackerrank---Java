// Author: Atharv Damle
// Demonstrate use of String data.
// Full Question: https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.util.*;
public class StringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        // Substring gives part of the string. 
        
        // compareToIgnoreCase returns which String will come first in a dictionary. It gives the difference 
        // between the first letter where the two strings differ. >0 if first one comes later in the dictionary
        // =0 if the words are the same, and <0 if the first string occurs earlier in the dictionary.
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes":"No");
        System.out.println(Character.toUpperCase(A.charAt(0))
                             + A.substring(1, A.length()) 
                             + " " 
                             + Character.toUpperCase(B.charAt(0)) 
                             + B.substring(1, B.length()));
        
    }
}



