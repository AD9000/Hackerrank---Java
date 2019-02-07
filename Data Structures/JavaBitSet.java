// Author: Atharv Damle
// Use the BitSet class to perform different operations.
// Full Question: https://www.hackerrank.com/challenges/java-bitset/problem

import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        // Create 2 BitSet objects
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        for (int i = 0; i < m; i++)
        {
            String s = in.next();
            
            if (s.equalsIgnoreCase("AND"))
            {
                // and() = & for two numbers ie bitwise and
                
                int x = in.nextInt();
                if (x == 1) {
                    b1.and(b2);
                } else {
                    b2.and(b1);
                }
                in.nextInt();
            }
            else if (s.equalsIgnoreCase("OR"))
            {
                // or() = | for two numbers. ie bitwise or
                
                int x = in.nextInt();
                if (x == 1) {
                    b1.or(b2);
                } else {
                    b2.or(b1);
                }
                in.nextInt();
            }
            else if (s.equalsIgnoreCase("SET"))
            {
                // set(i) changes the bit at index i to be 1
                
                int x = in.nextInt();
                if (x == 1)
                {
                    b1.set(in.nextInt());
                }
                else
                {
                    b2.set(in.nextInt());
                }
            }
            else if (s.equalsIgnoreCase("FLIP"))
            {
                // flip(i) changes the bit at index i to be opposite of what it is at the moment. ie 1 to 0 and 0 to 1.
                
                int x = in.nextInt();
                if (x == 1) {
                    b1.flip(in.nextInt());
                } else {
                    b2.flip(in.nextInt());
                }
            }
            else
            {
                // xor() performs bitwise xor on the sets.
                
                int x = in.nextInt();
                if (x == 1) {
                    b1.xor(b2);
                } else {
                    b2.xor(b1);
                }
                in.nextInt();
            }
            
            // cardinality() returns the number of 1 bits in the set.
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}

