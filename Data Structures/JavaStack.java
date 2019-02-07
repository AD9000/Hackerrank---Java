// Author: Atharv Damle
// Use a stack to see if paranthesis in a String is balanced.
// Full Question: https://www.hackerrank.com/challenges/java-stack/problem

// Logic: Add the opening brackets in a stack. Remove the top bracket if its match is found.
// If the stack is empty at the end of the string, it is balanced (as all brackets are now in pairs), else it is not.

import java.util.*;
class JavaStack
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            int l = input.length();
            
            // Deque is the recommended Java implementation of stack. It will take in Character type data
            Deque<Character> s = new ArrayDeque<>();
            
            for (int i = 0; i < l; i++)
            {
              char ch = input.charAt(i);
              
              // peek() function returns the next element that can be removed from the stack
              // Pairs of brackets have a maximum difference of 2. (According to the ASCII Table)
              if (!s.isEmpty() && ((s.peek() == ch - 1) || (s.peek() == ch - 2)))
              {
                  // Remove element from top of stack
                  s.removeFirst();
              }
              else
              {
                  // Add element to the top of stack.
                  s.addFirst(ch);
              }
            }
            
            // If the stack is not empty...
            if (!s.isEmpty())
            {
              System.out.println(false);
            }
            else
            {
              System.out.println(true);
            }
		}
	}
}



