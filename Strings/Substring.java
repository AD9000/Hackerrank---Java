// Author: Atharv Damle
// To demonstrate use of substring method.
// Full Question: https://www.hackerrank.com/challenges/java-substring/problem

import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(S.substring(in.nextInt(), in.nextInt()));
        in.close();
    }
}

