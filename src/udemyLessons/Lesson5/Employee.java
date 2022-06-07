package udemyLessons.Lesson5;

public class Employee {


    void Salary(int id, String surname, int age, double salary, String department) {
        System.out.println("surname: " + surname + " Salary: " + (salary * 2)+" department: "+department);

    }

    static class EmployeeTest {
        public static void main(String[] args) {
            Employee employee = new Employee();
            Employee employee1 = new Employee();

            employee.Salary(1, "Korovkin", 34, 12000, "it");
            employee1.Salary(2, "Kostreba", 31, 17000, "JavaScriptDepartment");


        }
    }
}
