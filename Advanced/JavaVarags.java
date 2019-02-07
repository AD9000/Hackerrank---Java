// Author: Atharv Damle
// Create a function to accept variable arguments and calculate and print their sum.
// Full Question: https://www.hackerrank.com/challenges/simple-addition-varargs/problem

class Add {
    // ...a signifies a variable argument function. It accepts a variable number of integers
    // and converts them to an int array.
    void add(int ...a)
    {
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++)
        {
            sum += a[i];
            System.out.print(a[i] + "+");
        }
        sum += a[a.length - 1];
        System.out.println(a[a.length - 1] + "=" + sum);
    }
}
