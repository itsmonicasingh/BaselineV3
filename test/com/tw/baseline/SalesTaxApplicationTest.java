package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesTaxApplicationTest {

    @Test
    public void shouldReturnZeroIfNoItemIsPurchased() {
        SalesTaxApplication salesTaxApplication = new SalesTaxApplication();

        assertEquals(0.0, salesTaxApplication.Tax(), 0.0d);
    }
}
