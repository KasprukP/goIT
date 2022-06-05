package udemyLessons;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    int averageMath;
    int averageEconomic;
    int foreignLanguages;

    static class StudentTest {
        public static void main(String[] args) {
            Student student = new Student();
            Student student2 = new Student();
            Student student3 = new Student();

            student.id = 1;
            student.name = "Pavel";
            student.surname = "Kaspruk";
            student.year = 1991;
            student.averageMath = 7;
            student.averageEconomic = 12;
            student.foreignLanguages = 8;


            student2.id = 2;
            student2.name = "Oleg";
            student2.surname = "Karuto";
            student2.year = 1993;
            student2.averageMath = 12;
            student2.averageEconomic = 3;
            student2.foreignLanguages = 6;


            student3.id = 3;
            student3.name = "Simon";
            student3.surname = "Smetankovskij";
            student3.year = 1992;
            student3.averageMath = 7;
            student3.averageEconomic = 11;
            student3.foreignLanguages = 10;


            System.out.println(student.name + " " + student.surname + " AverageMark  " + ((student.averageMath + student.averageEconomic + student.foreignLanguages) / 3));
            System.out.println(student2.name + " " + student2.surname + " AverageMark  " + ((student2.averageMath + student2.averageEconomic + student2.foreignLanguages) / 3));
            System.out.println(student3.name + " " + student3.surname + " AverageMark  " + ((student3.averageMath + student3.averageEconomic + student3.foreignLanguages) / 3));

        }

    }

}
