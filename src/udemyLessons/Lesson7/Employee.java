package udemyLessons.Lesson7;

public class Employee {
    public double salary;

    public void dvoynayaZP(){
        System.out.println("Novaya ZP " + salary*2);
    }
    public Employee (double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        Employee emp=new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}
