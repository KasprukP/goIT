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

        if (galaxy!=null) {
            return new String[]{galaxy};



        }

        return new String[0];
    }

            //Test output
            public static void main(String[] args) {
                SaveStarShip ship = new SaveStarShip();

                //Should be 10
                System.out.println(ship.calculateDistance(-10));
            }
        }

