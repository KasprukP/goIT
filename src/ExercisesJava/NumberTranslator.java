package ExercisesJava;

import java.util.ArrayList;
import java.util.List;

public class NumberTranslator {
    public int translate(String romanNumber) {
        int number = 6;


        switch (number) {


            case 1:
                romanNumber.replace("I", "1");
                break;
            case 2:
                romanNumber.replace("II", "2");
                break;
            case 3:
                romanNumber.replace("III", "3");
                break;
            case 4:
                romanNumber.replace("IV", "4");
                break;
            case 5:
                romanNumber.replace("V", "5");
                break;
            case 6:
                romanNumber.replace("VI", "6");
                break;
            case 7:
                romanNumber.replace("VII", "7");
                break;
            case 8:
                romanNumber.replace("VIII", "8");
                break;
            case 9:
                romanNumber.replace("IX", "9");
                break;
            case 10:
                romanNumber.replace("X", "10");
                break;
            case 11:
                romanNumber.replace("XI", "11");
                break;
            case 12:
                romanNumber.replace("XII", "12");
                break;
        }
        return number;
    }
}

