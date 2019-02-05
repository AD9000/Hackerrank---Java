// Author: Atharv Damle
// Print multiplication tables using a loop. Any code inside the loop is repeated till a certain condition is true. Here i <= 10.
// Full Question: https://www.hackerrank.com/challenges/java-loops-i/problem

import java.util.*;

public class Loop1 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(N +" x " + i + " = " + N*i);
        }
        scanner.close();
    }
}
