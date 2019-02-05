// Author: Atharv Damle
// Accept input from the user and print it to the screen. This time different data types are taken as input instead of just sentences.
// Full Question: https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        // nextDouble() accepts the next real number
        double d = scan.nextDouble();
        
        // Accept the next line (sentence). This is done twice to skip the newline character (from when enter key is pressed)
        String s = scan.nextLine();
        s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

