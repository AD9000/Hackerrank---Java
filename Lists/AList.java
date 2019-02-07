// Author: Atharv Damle
// To demonstrate using the List interface with the LinkedList Class.
// The operations performed are just adding, removing and checking if it is empty, hence there is no need to use an ArrayList.
// (Which uses an underlying array)
// Full Question: https://www.hackerrank.com/challenges/java-list/problem

import java.io.*;
import java.util.*;

public class AList {

    public static void main(String[] args) {
        // Create a list object using a LinkedList class. The list l now uses a LinkedList implementation.
        List l = new LinkedList();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            // Add element to list
            l.add(in.nextInt());
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++)
        {
            if (in.next().charAt(0) == 'I')
            {
                // Add element to list at a certain position.
                l.add(in.nextInt(), in.nextInt());
            }
            else
            {
                // Remove from list.
                l.remove(in.nextInt());
            }
        }
        
        // Check if list is empty.
        while (!l.isEmpty())
        {
            // Remove item at index 0 (first item) from the list.
            System.out.print(l.remove(0) + " ");
        }
    }
}

