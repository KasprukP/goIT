package ExercisesJava;

import java.util.Arrays;

public class UberShop {
    public void multiplyPrices(float[] prices) {

        for (int i = 0; i <prices.length; i++ ) {
            if (i < 1000) {
                prices[i] = prices[i]*2;


            }
            else if (i>=100){
                prices[i] =  (prices[i]*1.5f);
            }

        }
    }



    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be [200, 2250]
        float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
    }
}

