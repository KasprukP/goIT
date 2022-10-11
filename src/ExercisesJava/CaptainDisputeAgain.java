package ExercisesJava;

import java.util.Arrays;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int[] triple2 = triple.clone();
        Arrays.sort(triple2);

        return triple2[0];
    }

    public static void main(String[] args) {

    }
}
