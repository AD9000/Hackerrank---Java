// Author: Atharv Damle
// Format numbers to be displayed as currency from different locales.
// Full Question: https://www.hackerrank.com/challenges/java-currency-formatter/problem

import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        // Since there is no static constant in Locale class for india, the language which the currency should be
        // displayed in (English) and the locale code (IN) is used. This can be done for any country, even the ones
        // that have their own static constants.
        String india = NumberFormat.getCurrencyInstance(new Locale("EN", "IN")).format(payment);
        
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

