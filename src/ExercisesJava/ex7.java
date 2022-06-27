package ExercisesJava;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите число для умножения ");
        int b= sc.nextInt();
        for (int a=0;a<= 9;a++){
            System.out.println(b + "x"+ (a+1)+"="+(b*(a+1)));
        }
    }

    }
