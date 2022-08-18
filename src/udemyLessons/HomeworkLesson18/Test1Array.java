package udemyLessons.HomeworkLesson18;


public class Test1Array {
    public static int[] sortirovka(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;

                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;

            }
        }
        return array;

    }

    public static void main(String[] args) {
        int[] array = {3, 5, 2, 6, 8, 2, 1, 5, 7};
        sortirovka(array);
        for (int y = 0; y < array.length; y++) {
            System.out.print(array[y]);

        }
    }
}