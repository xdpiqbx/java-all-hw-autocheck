package module_004.Task_004;

import java.util.*;

public class UberShop {
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for(int price: prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[] {min};
        }

        return new int[] {min, max};
    }

    public int getMinPriceCount(int[] prices){
        int arrLen = prices.length;
        if(arrLen == 0){
            return 0;
        }
        int minCount = 0;
        float minPrice = 0;
//        for (int i = 0; i < arrLen; i++) {
//            minPrice = prices[i];
//        }
        return minCount;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices)); //Should be 2
    }
}