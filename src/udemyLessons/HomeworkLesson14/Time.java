package udemyLessons.HomeworkLesson14;

public class Time {
    static void vremya() {
        OUTER:
        for (int chas = 0; chas <= 5; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (chas > 1 && minuta % 10 == 0)
                    break OUTER;
                INNER:
                for (int secunda = 0; secunda <= 59; secunda++) {

                    if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                }
            }
        }

    }


    public static void main(String[] args) {

        vremya();
    }
}
