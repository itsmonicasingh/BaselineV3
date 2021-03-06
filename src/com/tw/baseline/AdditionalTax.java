
package com.tw.baseline;

public class AdditionalTax {

    private final String itemName;
    private final Double itemPrice;

    public AdditionalTax(String itemName, Double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    private boolean isImported() {
        if (itemName.contains("imported")) {
            return true;
        } else
            return false;
    }

    public double calculateAdditionalTax() {
        if (this.isImported())
            return 0.5 * itemPrice;
        return 0.0;
    }
}
