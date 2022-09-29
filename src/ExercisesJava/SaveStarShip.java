package ExercisesJava;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance > 0) {
            return distance;
        } else {
            return -distance;
        }
    }

    public String[] getPlanets(String galaxy) {
        String[] Miaru = {"Maux", "Reux", "Piax"};
        String[] Milkyway = {"Earth", "Mars", "Jupiter"};
        String[] DangerBanger = {"Fobius", "Demius"};

        if (galaxy.equals("Miaru")) {
            return Miaru;
        } else if (galaxy.equals("Milkyway")) {
            return Milkyway;
        } else if (galaxy.equals(DangerBanger)) {
            return DangerBanger;
        } else
            return new String[0];
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        }
        {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return count * 70;
        } else if (fuel.equals("STAR500")) {
            return count * 120;
        } else if (fuel.equals("STAR1000")) {
            return count * 200;
        } else {

        }
        return count * 50;
    }

    public int roundSpeed(int speed) {

        return speed - speed % 10;
    }

    public int calculateNeededFuel(int distance) {
        if (distance < 20) {
            return 1000;
        } else if (distance > 20) {

        }
        return (distance - 20) * 5 + 1000;
    }

    public void calculateMaxPower() {
        Scanner in = new Scanner(System.in);
        int power1 = in.nextInt();
        int power2 = in.nextInt();
        int power3 = in.nextInt();
        int superpower = IntStream.of(power1, power2, power3).reduce(Math::max).getAsInt();
        float k1 = 0.7f;
        float k2 = 1.2f;
        float k3 = 2.1f;
        if (superpower < 10) {
            System.out.println(superpower * k1);
        } else if (10 <= superpower && superpower < 100) {
            System.out.println(superpower * k2);
        } else if (superpower > 100) {
            System.out.println(superpower * k3);
            in.close();
        }
    }

    public String getMyPrizes(int ticket) {
        if (ticket % 10 == 0) {
            return "crystall";
        } else if (ticket % 10 == 7) {
            return "chip";
        } else if (ticket > 200) {
            return "coin";
        }
return " ";
    }




//Test output
public static void main(String[]args){
        SaveStarShip ship=new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100",10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();
        }
        }