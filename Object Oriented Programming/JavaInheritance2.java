// Author: Atharv Damle
// To use inheritance to add two numbers.
// Full Question: https://www.hackerrank.com/challenges/java-inheritance-2/problem

class Arithmetic
{
    int add (int a, int b)
    {
        return a + b;
    }
}

class Adder extends Arithmetic
{
    int add (int a, int b)
    {
        return super.add(a, b);
    }
}
