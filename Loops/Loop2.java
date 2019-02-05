// Author: Atharv Damle
// To calculate and print the sum of a mathematical series.
// Full Question: https://www.hackerrank.com/challenges/java-loops/problem

import java.util.*;

class Loop2{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a + b;
            for(int j = 0; j < n; j++)
            {
                System.out.print(sum + " ");
                sum += b * (int)(Math.pow(2,j+1));
            }            
            System.out.println();
        }
        in.close();
        
        
    }
}

