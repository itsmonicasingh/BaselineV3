
package com.tw.baseline;

public class AdditionalTax {

    private final String itemName;
    private final Double itemPrice;

    public AdditionalTax(String itemName, Double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double calculateAdditionalTax() {
        return 0.0;
    }
}
