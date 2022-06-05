package udemyLessons.Lesson5;

public class Cars {
    int summa(int a, int b,int c){
        int result = a+b+c;
        return result;
    }
    static class Test21{
        public static void main(String[] args) {
            Cars c = new Cars();
            System.out.println(c.summa(3,4,5));
        }
    }
}
