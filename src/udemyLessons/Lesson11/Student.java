package udemyLessons.Lesson11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course,double grade){

        this.name=name;
        this.course= course;
        this.grade=grade;

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3,9.5);
        Student st2= new Student("Oleg",4,5.6);

    }
}
