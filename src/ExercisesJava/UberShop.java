package ExercisesJava;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {


        for (int k = 0; k < prices.length;k++);{
            System.out.println(prices[k] +  );
        }

    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
        float[] prices = new float[] {100f, 23.5f, 400f};
        shop.printPrices(prices);
    }
}

