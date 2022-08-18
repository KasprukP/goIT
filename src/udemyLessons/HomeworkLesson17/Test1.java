package udemyLessons.HomeworkLesson17;

public class Test1 {
    public static boolean ravenstvo(StringBuilder s1, StringBuilder s2) {

        return (s1.toString().equalsIgnoreCase(s2.toString()));
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("privet");
        System.out.println(ravenstvo(sb1, sb2));

    }
}


