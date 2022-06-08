package udemyLessons.Lesson6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show (String s1){
        System.out.println(s1);
    }

    public static void main(String[] args) {
        MethodOverloading mO= new MethodOverloading();
        int a = 2;
        mO.show(a);
        String b = "Oleg";
        mO.show(b);
        boolean d = true;
        mO.show(d);
    }
}
