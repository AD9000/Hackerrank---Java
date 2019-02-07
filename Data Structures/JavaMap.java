// Author: Atharv Damle
// To implement a phonebook using a HashMap. A HashMap is like a dictionary which has values which are indexed by custom keys.
// Here the phone numbers are values and the names are keys. (The keys must always be unique, so making the phone numbers
// the keys is better)
// Full Question: https://www.hackerrank.com/challenges/phone-book/problem

import java.util.*;
import java.io.*;

class JavaMap
{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();

    // Create a HashMap with String keys and Integer values (note it is not int but Integer)
    HashMap<String, Integer> m = new HashMap<>();
    
		for(int i=0;i<n;i++)
		{
      // Add one pair of data into the HashMap
			m.put(in.nextLine(), in.nextInt());
			in.nextLine();
		}
    
    // While there is more input...
		while(in.hasNext())
		{
			String s=in.nextLine();
      
      // If the HashMap contains the key s... (the variable and not the letter)
      if (m.containsKey(s))
      {
          // Get the phone number for the key and print it to screen.
          System.out.println(s + "=" + m.get(s));
      }
      else
      {
          System.out.println("Not found");
      }
		}
	}
}
