// Author: Atharv Damle
// Check if a regex (regular expression) is valid.
// Full Question: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker
{
	public static void main(String[] args){
  
		Scanner in = new Scanner(System.in);
    
		int testCases = Integer.parseInt(in.nextLine());
    while(testCases>0){
    
      // Accept the pattern as input.
			String pattern = in.nextLine();
      try
      {
          // Load the pattern. Try to create a Pattern object. If it fails, an error will be raised.
          Pattern.compile(pattern);
          System.out.println("Valid");
      }
      catch (Exception e)
      {
          System.out.println("Invalid");
      }

      testCases--;
		}
	}
}



