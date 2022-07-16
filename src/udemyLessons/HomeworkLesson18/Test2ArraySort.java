package udemyLessons.HomeworkLesson18;

public class Test2ArraySort {
    public static int[] sort(int[] array) {
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
return array;
    }

    public static void main(String[] args) {
        int [] massive = {1,3,5,7,9,2,4,6,8};

        sort(massive);
        for (int i=0;i<massive.length;i++){
            System.out.print(massive[i]);
        }
    }
}
