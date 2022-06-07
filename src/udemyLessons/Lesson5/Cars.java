package udemyLessons.Lesson5;

public class Cars {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }
    int tormoz (int skorost){
        speed-=skorost;
        return speed;

    }
    void showInfo(){
        System.out.println("cvet "+color+ " motor "+ engine +" skorost "+speed);
    }

    static class Car{
        public static void main(String[] args) {
            Cars c1= new Cars();
            c1.color="white";
            c1.engine="V6";
            c1.speed=35;
            c1.showInfo();
            c1.gaz(20);
            c1.showInfo();
            c1.tormoz(55);
            c1.showInfo();
        }
    }

}
