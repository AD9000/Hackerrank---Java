// Author: Atharv Damle
// Singleton pattern: Create a class that can be used to create objects. However, only one object can exist at any time.
// Full Question: https://www.hackerrank.com/challenges/java-singleton/problem

class Singleton{
    // The object instance is made:
    // 1. Global, so that the same variable name is used and the class does not allow different objects of the class to exist.
    // 2. private, so that the object instance cannot be accessed from outside the class
    // 3. static, so that the variable is shared between all the instances (objects) of the class, preventing
    //    the existence of more than one object (that is returned) at any time.
    private static Singleton instance = null;
    
    // constructor is made private so class cannot be instanciated without calling the getSingleInstance() function
    private Singleton()
    {
    }
    
    // static, again, to allow existence of only one object.
    static Singleton getSingleInstance()
    {
        // If object does not exist, create a new object.
        if (instance == null)
        {
            instance = new Singleton();
        }
        
        // If the object exists, the already created object is returned.
        return instance;
    }
}
