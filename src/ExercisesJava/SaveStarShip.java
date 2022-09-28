package ExercisesJava;

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



    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}

