package udemyLessons.Lesson6;

public class overloadedHomeWork {
    int sum() {
        int result = 0;
        System.out.println("summa treh chisel: " + result);
        return result;
    }

    int sum(int n1) {
        int result1 = n1;
        System.out.println("summa treh chisel: " + result1);
        return result1;
    }

    int sum(int n1, int n2) {
        int result2 = n1 + n2;
        System.out.println("summa treh chisel: " + result2);
        return result2;}

        int sum ( int n1, int n2, int n3){
            int result3 = n1 + n2 + n3;
            System.out.println("summa treh chisel: " + result3);
            return result3;
        }
        static class sumirovanieTest{
            public static void main(String[] args) {
                overloadedHomeWork s1 = new overloadedHomeWork();
                s1.sum(2,2);
                s1.sum();
                s1.sum(3,3,3);
            }
        }
    }
