// Author: Atharv Damle
// Convert date to the day of the week.
// Full Question: https://www.hackerrank.com/challenges/java-date-and-time/problem

import java.util.*;
import java.time.LocalDate;

class DateTime {

    public static String findDay(int month, int day, int year) {
    
        // Solution 1: Only from Java 8. LocalDate Class converts date to day of week
        // By using a getDayOfWeek() method.
        LocalDate d = LocalDate.of(year, month, day);
        return d.getDayOfWeek().toString();
        
        /*
        // Using Calendar class. It does not return the day name. However, calculates the day number of the week
        
        String days[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar c = Calendar.getInstance();
        
        // month - 1 as indexing of months begins from 0 and not 1.
        c.set(year, month - 1, day);
        
        return days[c.get(Calendar.DAY_OF_WEEK) - 1];
        */
    }

}
