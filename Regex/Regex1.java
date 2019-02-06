// Author: Atharv Damle
// Create a regex pattern to check if an ip address is valid or not.
// Full Question: https://www.hackerrank.com/challenges/java-regex/problem

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex
{
    String z = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = z + "." + z + "." + z + "." + z; 
    
}
