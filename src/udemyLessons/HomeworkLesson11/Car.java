package udemyLessons.HomeworkLesson11;

public class Car {
    String color;
    String engine;
    int doorsCount;


   public Car(String color, String engine, int doorsCount) {
        this.color = color;
        this.engine = engine;
        this.doorsCount = doorsCount;

    }

    static class CarTest {
        void changeDoors(Car c, int doorsCount) {
            c.doorsCount = doorsCount;
        }

        void changeColor(Car c1, Car c2) {
            String color = c1.color;
            c1.color = c2.color;
            c2.color = color;
        }
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("krasnuj", "v12", 4);
        Car car2 = new Car("Blue", "W6", 2);
        ct.changeDoors(car1,3);
        ct.changeColor(car1,car2);
        System.out.println("information "+car1.color+ " Engine "+car1.engine+"Doors "+car1.doorsCount);

    }
}
