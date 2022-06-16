package udemyLessons.Lesson9;

public class Car {
    String color;
    String engine;
    static int count;


     public Car (String color, String engine) {
        count++;
        this.color=color;
        this.engine=color;

    }

    public void ShowColor(){
        System.out.println("Цвет машини"+ color);

    }
    public void ChangeColor(String color){
        String a = color;
        System.out.println("Цает машини изменился");
        int cena=5000;
        cena+=1000;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
