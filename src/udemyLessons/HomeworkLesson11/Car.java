package udemyLessons.HomeworkLesson11;

public class Car {
    String color;
    String engine;
    int doors;


    Car(String color,String engine,int doors){
        this.color=color;
        this.engine=engine;
        this.doors=doors;

    }

    public static void main(String[] args) {
Car c1 = new Car("krasnuj","v12",4);
        System.out.println(c1.color);
    }
}
