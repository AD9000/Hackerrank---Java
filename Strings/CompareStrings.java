// Author: Atharv Damle
// Compare Strings using compareTo method.
// Full Question: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

import java.util.Scanner;
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s;
        String largest = "";
        
        int l = s.length();
        for (int i = 0; i <= l - k; i++)
        {
            String x = s.substring(i, i + k);
            
            // If x is smaller (earlier in alphabetical order) than smallest...
            if (smallest.compareTo(x) > 0)
            {
                smallest = x;
            }
            
            // If x is larger (later in alphabetical order) than largest... 
            if (largest.compareTo(x) < 0)
            {
                largest = x;
            }
        }
        
        return smallest + "\n" + largest;
    }
