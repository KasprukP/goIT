package udemyLessons.Lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

   public Employee(int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }

    Employee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, int salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

   static class EmployeeTest {
        public static void main(String[] args) {
            Employee emp1 = new Employee(2, "petrov", 23);
            System.out.println(emp1.age);
            Employee emp2 = new Employee(12,"Kaspruk",23,12000,"IT");
            System.out.println(emp2.surname);
            Employee emp3 = new Employee("Kaspruk",23);
            System.out.println(emp3);
        }


    }
}
