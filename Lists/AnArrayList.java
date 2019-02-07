// Author: Atharv Damle
// To demonstrate using an ArrayList.
// Full Question: https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Make an ArrayList of ArrayLists. (Like a 2D ArrayList)
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(n);

        // Add elements to the ArrayList
        for (int i = 0; i < n; i++)
        {
            int l = in.nextInt();
            ArrayList<Integer> line = new ArrayList<Integer>(l);

            for (int j = 0; j < l; j++)
            {
                line.add(in.nextInt());
            }
            a.add(line);
        }

        // Accept and solve queries.
        int q = in.nextInt();

        for (int i = 0; i < q; i++)
        {
            try
            {
                System.out.println(a.get(in.nextInt() - 1).get(in.nextInt() - 1));
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println("ERROR!");
            }
        }

        in.close();
    }
}

