public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: R" + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe");
        emp1.age = 30;
        emp1.designation = "Software Engineer";
        emp1.salary = 5000.0;
        emp1.printEmployee();

        Employee emp2 = new Employee("Jane Smith");
        emp2.age = 35;
        emp2.designation = "Manager";
        emp2.salary = 8000.0;
        emp2.printEmployee();

        Employee emp3 = new Employee("Mike Johnson");
        emp3.age = 25;
        emp3.designation = "Intern";
        emp3.salary = 2000.0;
        emp3.printEmployee();
    }
}
