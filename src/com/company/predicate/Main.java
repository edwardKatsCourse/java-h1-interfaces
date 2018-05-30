package com.company.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<String> p = new IsDigit();

        System.out.println(p.test("12"));

        List<String> possibleDigits = new ArrayList<>();

        possibleDigits.add("123");
        possibleDigits.add("76176");
        possibleDigits.add("424");
        possibleDigits.add("41.124");
        possibleDigits.add("412,4");
        possibleDigits.add("87897$879");

//        Predicate<String> predicate1 = new IsDigit();
//        Predicate<String> predicate2 = new IsDigit();
//
//        predicate1.and(predicate2);
//
        IsDigit isDigit = new IsDigit();
        new IsDigit();

        System.out.println("BEFORE \"PREDIFICATION\"");
        System.out.println(possibleDigits);

        possibleDigits.removeIf(isDigit);
        /*
        for (String s : possibleDigits) {
            if (new IsDigit().test(s)) {
                possibleDigits.remove(s);
            }
        }
        */

        // if( value 1 || value2 ) ->    .or
        // if( value1 && value2 )  ->    .and
        // if(value)               ->    .test
        // if(!value)              ->    .negate

        System.out.println();
        System.out.println("AFTER \"PREDIFICATION\"");
        System.out.println(possibleDigits);
    }
}

class IsDigit implements Predicate<String> {
    @Override
    public boolean test(String s) {

        //abc
        //ACSII
        //string - char
        //A      - 65
        //B      - 66
        for (char c : s.toCharArray()) {
            if (c < 48 || c > 57) {
                return false;
            }
        }
        return true;
    }
}
