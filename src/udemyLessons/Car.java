package udemyLessons;

public class Car {
    String color = "red";
    String engine = "V8";

    static class CarTest {
        public static void main(String[] args) {
            Car car1 = new Car();
            car1.engine ="V8";

            System.out.println(car1.engine);

        }
    }
}
