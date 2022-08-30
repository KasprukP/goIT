package ExercisesJava;

import java.util.Arrays;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + "AND" + names[9] + "TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{results[2], results[3], results[4]};
    }
    public char[][] createKeyboard(){
        char[][] keybord = new char[4][3];
        keybord [0][0]= '1';
        keybord [0][1]= '2';
        keybord [0][2]= '3';
        keybord [1][0]= '4';
        keybord [1][1]= '5';
        keybord [1][2]= '6';
        keybord [2][0]= '7';
        keybord [2][1]= '8';
        keybord [2][2]= '9';
        keybord [3][0]= '*';
        keybord [3][1]= '0';
        keybord [3][2]= '#';
        return keybord;
    }
    public void printKeyboard(){
        char[][] key = createKeyboard();
        System.out.println(Arrays.toString(createKeyboard()[1]));
        System.out.println(Arrays.toString(createKeyboard()[2]));
        System.out.println(Arrays.toString(createKeyboard()[3]));
    }
    public static void main(String[] args) {
        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        System.out.println(new HarekCity().firstAndLastTogether(names));
    }
}