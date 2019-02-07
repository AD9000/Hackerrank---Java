// Author: Atharv Damle
// To use try catch to handle exceptions (Runtime errors).
// The code in catch block is executed if any error occurs in the try block.
// Full Question: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;

public class TryCatch {

    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
            sc.close();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        // Catch any other exception
        catch (Exception e)
        {
            // Here's my code. by using getClass().getName() you handle all other exceptions that may occur
            System.out.println(e.getClass().getName());
        }
    }
}

