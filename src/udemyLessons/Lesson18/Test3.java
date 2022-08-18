package udemyLessons.Lesson18;

public class Test3 {
    public static void main(String[] args) {
        String[][] array = {{"Petrov","Sidorov"}, {"Kolbasov","Serdelkin", "Seledkin"},{"Oleg","Vasya"}};
        for (String []array2:array){
            for (String a : array2){
                System.out.println(a);
            }
        }
    }
}
