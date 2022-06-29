package ExercisesJava;

public class ex15 {
    public static void main(String[] args) {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Перед обменом: a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("после обмена : a, b = "+a+", "+ + b);
    }
}
