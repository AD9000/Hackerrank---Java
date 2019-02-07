// Author: Atharv Damle
// Create a class to calulate n^p and throw an error in case that n or p <= 0.
// Full Question: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

class MyCalculator {
    long power (int n, int p) throws Exception
    {
        if (n == 0 && p == 0)
        {
            // Create an Exception class object with a message and throw the exception
            throw(new Exception("n and p should not be zero."));
        }
        else if (n < 0 || p < 0)
        {
            // Create an Exception class object with a message and throw the exception
            throw(new Exception("n or p should not be negative."));
        }
        
        // Calculate n^p and cast it to long.
        return (long)Math.pow(n, p);
    }
    
}
