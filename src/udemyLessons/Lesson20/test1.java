package udemyLessons.Lesson20;

public class test1 {
    public static void main(String[] args) {
        String[][] array = {{"Petrov","Sidorov"}, {"Kolbasov","Serdelkin", "Seledkin"},{"Oleg","Vasya"}};
        for (String []array2:array){
            for (String a : array2){
                System.out.println(a);
            }
        }
    }
}
