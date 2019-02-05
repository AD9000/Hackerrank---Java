// Author: Atharv Damle
// Function to check if two Strings are anagrams of each other. O(n) implementation.
// Full Question: https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Scanner;
public class Anagrams {

    // The function counts the frequency of each letter in each word. If this is found to be equal, then the 
    // two Strings are anagrams of each other.
    static boolean isAnagram(String a, String b) {
        int countA[] = new int[26];
        int countB[] = new int[26];

        int l = a.length();
        for (int i = 0; i < l; i++)
        {
            countA[Character.toLowerCase(a.charAt(i)) - 'a']++;
        }

        l = b.length();
        for (int i = 0; i < l; i++)
        {
            countB[Character.toLowerCase(b.charAt(i)) - 'a']++;
        }

        for (int i = 0; i < 26; i++)
        {
            if (countA[i] != countB[i])
            {
                return false;
            }
        }
        return true;
    }
}
