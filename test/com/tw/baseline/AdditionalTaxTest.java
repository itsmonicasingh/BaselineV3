
package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionalTaxTest {

    @Test
    public void shouldReturnZeroIfAmountIsZero() {
        AdditionalTax additionalTax = new AdditionalTax(" ", 0.0);

        assertEquals(0.0, additionalTax.calculateAdditionalTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroWhenItemIsNotImported() {
        AdditionalTax additionalSalesTax = new AdditionalTax("heheheh I am not from outside", 50.0);
        assertEquals(0.0, additionalSalesTax.calculateAdditionalTax(), 0.0d);
    }

    @Test
    public void shouldReturnTaxFivePercentWhenItemIsImported() {
        AdditionalTax additionalSalesTax = new AdditionalTax("Your bad luck!! I am an imported item", 50.0);
        assertEquals(25.0, additionalSalesTax.calculateAdditionalTax(), 0.0d);
    }

}
