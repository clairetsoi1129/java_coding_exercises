package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean result = false;
        if (input != null) {
            input = input.toLowerCase();
            for (char c = 'a'; c <= 'z'; c++) {
                if (input.indexOf(c) > -1) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
