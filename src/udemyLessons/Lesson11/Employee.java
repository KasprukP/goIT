package udemyLessons.Lesson11;

public class Employee {
    public String name;
    public double sellary;

    Employee(String name, double sellary) {
        this.name = name;
        this.sellary = sellary;

    }

    public double uvilichitel(double a) {
        a = a * 2;
        return a;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 12.600);
        double d = emp1.uvilichitel(emp1.sellary);
        System.out.println(d);
        System.out.println(emp1.sellary);
    }
}


