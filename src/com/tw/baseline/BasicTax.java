
package com.tw.baseline;

public class BasicTax {

    private String itemName;
    private double itemPrice;

    public BasicTax(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    public double calculateBasicTax() {
        return 0.0;
    }
}
