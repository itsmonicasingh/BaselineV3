
package com.tw.baseline;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicTax {

    private static ArrayList<String> isExempted = new ArrayList<String>(Arrays.asList("book", "chocolate bar", "chocolates", "pills"));
    private String itemName;
    private double itemPrice;

    public BasicTax(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    public double calculateBasicTax() {
        if (isExempted.contains(itemName)) {
            return 0.0;
        }
        return 0.0;
    }
}
