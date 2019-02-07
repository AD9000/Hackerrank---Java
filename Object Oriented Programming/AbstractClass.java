// Author: Atharv Damle
// To demonstrate overriding an abstract class
// Full Question: https://www.hackerrank.com/challenges/java-abstract-class/problem

// Book is an abstract class with a function with a definition: abstract void setTitle(String s);
class MyBook extends Book
{
    @Override
    void setTitle(String s)
    {
        super.title = s;
    }

    String getTitle()
    {
        return super.getTitle();
    }
}
