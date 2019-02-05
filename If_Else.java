// Author: Atharv Damle
// Check if a number is weird or not.
// Full Question: https://www.hackerrank.com/challenges/java-if-else/problem

import java.util.*;

public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        // If n is odd or (n greater than or equal to 6 and n less than or equal to 20)
        if (N % 2 != 0 || (N >= 6 && N <= 20))
        {
            System.out.println("Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
