package ExercisesJava;

import java.util.Arrays;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {

        int a = triple[0];
        int b = triple[1];
        int c = triple[2];
        return a < b && a < c ? a :
                b < a && b < c ? b
                        : c;
    }

}