package ExercisesJava;

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
        int max = 0;
        int min = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                min = prices[i];
                max = prices[i];
            } else {
                if (prices[i] < min) {
                    min = prices[i];
                }
                if (prices[i] > max) {
                    max = prices[i];
                }
            }
        }
        int[] array = {
                min,
                max
        };
        return array;
    }


    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [50, 1500]
        int[] prices = new int[]{100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices);
        System.out.println(Arrays.toString(minMax));
    }

}

