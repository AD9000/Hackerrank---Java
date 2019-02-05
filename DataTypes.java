// Author: Atharv Damle
// To demonstrate use of different data types in java. Here I checked for a outside range by checking if there is an error.
// You can also accept the number as a sentence and then convert it to an byte, short, int or long data type.
// Full Question: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

import java.util.*;

class DataTypes{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i = 0; i < t; i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -128 && x <= 127)
                {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767)
                {
                    System.out.println("* short");
                }
                long y = (int)(Math.pow(2, 31));
                if (x >= -y-1 && x <= y)
                {
                    System.out.println("* int");
                }
                y = (long)(Math.pow(2, 63));
                //System.out.println(-y);
                if (x >= -y-1 && x <= y)
                {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}



