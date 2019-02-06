// Author: Atharv Damle
// Calculate the number of subarrays whose sum is negative.
// Full Question: https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int count = 0;

        // Find sum of every subarray and check how many are less than zero
        for (int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
            // If the element is less than zero, it makes one negative subarray
            if (a[i] < 0)
            {
                count++;
            }
            int sum = a[i];

            // Counting in reverse to change the start of the subarray.
            // If count is in ascending order, subarrays not starting from index
            // 0 would not be counted.
            for (int j = i - 1; j >= 0; j--)
            {
                sum += a[j];
                if (sum < 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}

