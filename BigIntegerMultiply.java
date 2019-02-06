// Author: Atharv Damle
// Multiply big integers using the BigInteger class
// Full Question: https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Create 2 BigInteger objects
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());

        System.out.println(a.add(b).toString());
        System.out.println(a.multiply(b).toString());
    }
}

