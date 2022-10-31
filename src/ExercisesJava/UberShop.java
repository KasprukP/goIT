package ExercisesJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UberShop {
    public void multiplyPrices(float[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (i < 1000) {
                prices[i] = prices[i] * 2;


            } else if (i >= 100) {
                prices[i] = (prices[i] * 1.5f);
            }

        }
    }

    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[]{};
        }
        int min = prices[0];
        int max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (max < prices[i]) {
                max = prices[i];
            }
        }

        if (min == max) {
            return new int[]{min};
        }


        return new int[]{min, max};
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[]{ };
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }

}

