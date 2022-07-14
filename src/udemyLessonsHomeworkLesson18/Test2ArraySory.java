package udemyLessonsHomeworkLesson18;

import java.util.Arrays;

public class Test2ArraySory {
    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int [] massive = {1,4,2,6,4,8,2};
        System.out.println(massive);
    }
}
