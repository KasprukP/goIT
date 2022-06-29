package ExercisesJava;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число1: ");
        int num1 = sc.nextInt();
        System.out.println("Введите число2: ");
        int num2 = sc.nextInt();
        System.out.println("Введите число3: ");
        int num3 = sc.nextInt();

        System.out.println("Ответ: "+ ((num1+num2+num3)/3));
    }
}
