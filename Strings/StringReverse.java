// Author: Atharv Damle
// Reverse a String and check if it is a palindrome string. (Reversed String = Original String).
// Full Question: https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int l = A.length();
        int x = l/2;
        for (int i = 0; i < x; i++)
        {
            if (A.charAt(i) != A.charAt(l - 1 - i))
            {
                System.out.println("No");
                System.exit(1);
            }
        }
        System.out.println("Yes");
    }
}



