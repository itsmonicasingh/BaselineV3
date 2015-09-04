
package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicTaxTest {

    @Test
    public void shouldReturnZeroIfNoItemIsPurchased() {
        BasicTax basicTax = new BasicTax(" ", 0.0);

        assertEquals(0.0, basicTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsBook() {
        BasicTax basicSalesTax = new BasicTax("book", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsChocolateBar() {
        BasicTax basicSalesTax = new BasicTax("chocolate bar", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsChocolates() {
        BasicTax basicSalesTax = new BasicTax("chocolates", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

    @Test
    public void shouldReturnZeroIfItemIsPills() {
        BasicTax basicSalesTax = new BasicTax("chocolates", 10.0);

        assertEquals(0.0, basicSalesTax.calculateBasicTax(), 0.0d);
    }

}
