// Author: Atharv Damle
// Calculate the unique names entered using a HashSet.
// Full Question: https://www.hackerrank.com/challenges/java-hashset/problem

import java.util.*;

public class JavaHashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        // Divide the name in two parts.
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        /*
        // Implementation 1: Have a counter which keeps track of the elements added to the list. Print it.
        HashSet<String> h = new HashSet<>();

        int count = 0;
        for (int i = 0; i < t; i++)
        {
            if (h.contains(pair_left[i] + " " + pair_right[i]))
            {
                System.out.println(count);
                continue;
            }
            h.add(pair_left[i] + " " + pair_right[i]);
            count++;
            System.out.println(count);
        }
        */

        // Efficiency optimization: Count = h.size().
        // Also, since HashSet cannot have duplicate elements, checking if it contains an element already is redundant.
        HashSet<String> h = new HashSet<>();
        
        for (int i = 0; i < t; i++) 
        {
            h.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(h.size());
        }
   }
