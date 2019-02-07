// Author: Atharv Damle
// Factory Pattern: Code that makes a class a sort of a 'factory' that creates multiple objects.
// Full Question: https://www.hackerrank.com/challenges/java-factory/problem

if (order.compareToIgnoreCase("pizza") == 0)
{
    return new Pizza();
}
else
{
    return new Cake();
}
