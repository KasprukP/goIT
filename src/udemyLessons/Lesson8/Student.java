package udemyLessons.Lesson8;

public class Student {
    String name;
    int course;
   static int count;

    Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Zachislen na: " + count + " Kurs");

    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Oleg", 2);
        Student st2 = new Student("Gleb", 4);
        Student st3 = new Student("Gleb", 5);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

    }
}
