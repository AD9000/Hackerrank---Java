// Author: Atharv Damle
// Find the maximum value of an hourglass pattern in a 2D array.
// Full Question: https://www.hackerrank.com/challenges/java-2d-array/problem

import java.io.*;
import java.util.*;

public class TwoDArrays {

    // Find the hourglass value centred at (i + 1, j + 1).
    int sum(int a[][], int i, int j)
    {
        return(a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TwoDArrays ob = new TwoDArrays();
        int[][] arr = new int[6][6];

        // Accept the array.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = in.nextInt();
                arr[i][j] = arrItem;
            }
        }

        
        int max = -64;
        for (int i = 0; i < 4; i++)
        {
            for (int  j = 0; j < 4; j++)
            {
                int sum = ob.sum(arr, i, j);
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        
        System.out.println(max);

        scanner.close();
    }
}
