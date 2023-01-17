package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    private final String[] iceCreamFlavours = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate",
            "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        return Arrays.asList(iceCreamFlavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return iceCreamFlavours;
    }

}
