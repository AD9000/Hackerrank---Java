// Author: Atharv Damle
// Class which implements an interface with the definition: 

// interface AdvancedArithmetic{ int divisor_sum(int n); }

// Full Question: https://www.hackerrank.com/challenges/java-interface/problem

class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        return sum + n;
    }
}
