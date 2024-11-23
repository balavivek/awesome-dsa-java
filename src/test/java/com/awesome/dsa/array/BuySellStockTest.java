package com.awesome.dsa.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuySellStockTest {

    @Test
    public void testCase1() {
        BuySellStock buySellStock = new BuySellStock();
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        int result = buySellStock.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        BuySellStock buySellStock = new BuySellStock();
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        int result = buySellStock.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }
}
