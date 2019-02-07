// Author: Atharv Damle
// Code to demonstrate use of instanceof keyword.
// Full Question: https://www.hackerrank.com/challenges/java-instanceof-keyword/problem

// a instanceof b checks if 'a' is a subclass of 'b'. Returns true if yes otherwise false. 
// Since the instance of any class is inherited from Java Object, element acts as a sort of generic data type 
// which can be instanciated by any class.
Object element=mylist.get(i);
if(element instanceof Student)
  a++;
else if(element instanceof Rockstar)
  b++;
else if(element instanceof Hacker)
  c++;
