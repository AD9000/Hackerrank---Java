// Author: Atharv Damle
// Do some operations on a single dimension array.
// Full Question: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem

import java.util.*;

public class OneDArrays {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
