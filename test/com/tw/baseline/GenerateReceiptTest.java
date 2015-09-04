package com.tw.baseline;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenerateReceiptTest {

    @Test
    public void shouldReturnZeroIfNoItemIsPurchased() {
        GenerateReceipt receipt = new GenerateReceipt();

        assertEquals(0.0, receipt.Tax(), 0.0d);
    }
}
