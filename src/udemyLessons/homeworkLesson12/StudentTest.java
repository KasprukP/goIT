package udemyLessons.homeworkLesson12;

import udemyLessons.Lesson11.Student;

public class StudentTest {
    public static void method1(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Студенты одинаковые ");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void method2(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые но оценки разные");

                }
            } else {
                System.out.println("Имена студентов одинаковые но курсы разные");
            }
        } else {
            System.out.println("Имена студентов розличаются");

        }


    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan",2,4);
        Student s2 = new Student("Ivan",2,4);
        method1(s1,s2);
        method2(s1,s2);
    }
}