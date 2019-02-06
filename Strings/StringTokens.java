// Author: Atharv Damle
// Split a String into tokens and print it to the screen.
// Full Question: https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Accept the string. Remove any leading and trailing spaces (using trim() function)
        String s = scan.nextLine().trim();
        
        // Check bounds.
        if (s.length() == 0 || s.length() > 400000)
        {
            System.out.println(0);
            return;
        }
        
        // Split String s into different tokens. Split at a ' ', '!', ',' and any other character in the String: "[ !,?._'@]+"
        String split[] = s.split("[ !,?._'@]+");
        
        // Print to the screen
        System.out.println(split.length);
        for (int i = 0; i < split.length; i++)
        {
            System.out.println(split[i]);
        }
    }
}

