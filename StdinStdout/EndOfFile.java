// Author: Atharv Damle
// Accept input from the user till he/she decides to stop to inputting data.
// Full Question: https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.*;
public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        
        // While there is more input...
        while (sc.hasNextLine())
        {
            System.out.println(count+ " " + sc.nextLine());
            count++;
        }
    }
}

