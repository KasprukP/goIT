package udemyLessons.Lesson8;

public class Umnozhenie {
    static double Zadacha(double a, double b, double c) {
        return a * b * c;
    }

    static void Delenie (int a,int b){
        System.out.println("Celoe chislo "+ a/b+ "Ostatok: "+a%b);
    }

    public static void main(String[] args) {
        System.out.println(Umnozhenie.Zadacha(4,4,4));
        Umnozhenie.Delenie(4,2);
        System.out.println(Umnozhenie.Zadacha(20,9,4));
        Umnozhenie.Delenie(3,6);
    }
}
