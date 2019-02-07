// Author: Atharv Damle
// Create a class which prints an array of any data type. (ie a generic data type)
// Full Question: https://www.hackerrank.com/challenges/java-generics/problem

// Define a new data type 'E' which becomes the generic data type. (It cannot be two data types at once though)
// The only way two data types can be stored is if the data is stored as Objects. (Which works with this implementation)
class Printer<E>
{
    void printArray(E[] a)
    {
        // for each element 'ele' of data type 'E' in array 'a'...
        for (E ele: a)
        {
            System.out.println(ele);
        }
    } 
}
