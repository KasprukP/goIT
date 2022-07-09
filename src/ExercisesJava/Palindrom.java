package ExercisesJava;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPolendrom (String text){
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println(isPolendrom("топот"));
    }

}
