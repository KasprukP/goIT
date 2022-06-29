package ExercisesJava;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ширина: ");
        double num1 = sc.nextDouble();
        System.out.println("Высота: ");
        double num2 = sc.nextDouble();


        System.out.println("Ответ: " + (num1 * num2));
        System.out.println(" Периметр: "+ 2*(num1+num2));

    }
}
