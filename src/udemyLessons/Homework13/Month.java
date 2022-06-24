package udemyLessons.Homework13;

public class Month {
}

class dayMonth {
    public static void dayQuantity(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В єтом месяце 31 день");
                break;

            case 2:
                System.out.println("В єтом месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В єтом месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца не сущевствует ");

        }

    }

    public static void main(String[] args) {
        dayQuantity(2);
        dayQuantity(4);
        dayQuantity(14);
    }
}
