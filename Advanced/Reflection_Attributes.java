// Author: Atharv Damle
// Print all the methods of a class. Get the names of the methods from the class name.
// Full Question: https://www.hackerrank.com/challenges/java-reflection-attributes/problem

public class Reflection_Attributes {
    public static void main(String[] args){
        Class student = (new Student()).getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method i: methods){
            methodList.add(i.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
