package udemyLessons.Lesson16;

public class Car {
   String color;
   String engine;

   Car (String color,String engine){
       this.color = color;
       this.engine=engine;

    }
    public Car abc (String cvet){
       Car c10 = new Car(cvet,"V6");
       return c10;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Red", "V8");
        Car c2 = c1.abc("Black");
        System.out.println(c1.color);
    }
}
