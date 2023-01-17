package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double result = originalPrice*(1+vatRate/100);
        BigDecimal bd = new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int)users.stream()
                .filter(user -> "Linux".equalsIgnoreCase(user.getType()))
                .count();
    }
}
