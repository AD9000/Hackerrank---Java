// Author: Atharv Damle
// Format the output printed to screen.
// Full Question: https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class OutputForatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                // Add 15 spaces before String s (s1).
                // Then add a 3 digit number (x). If the number has less than 3 digits, fill with 0s.
                // Then add a new line (press enter). 
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");

    }
}



