public class Employeee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    public Employeee(String name) {
        this.name = name;
    }
    
    public void printEmployeee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: R" + salary);
    }
    
    public static void main(String[] args) {
        Employeee employee1 = new Employeee("John Doe");
        employee1.age = 30;
        employee1.designation = "Manager";
        employee1.salary = 50000.0;
        employee1.printEmployeee();
        
        System.out.println("---------------------");
        
        Employeee employee2 = new Employeee("Jane Matthews");
        employee2.age = 25;
        employee2.designation = "Developer";
        employee2.salary = 40000.0;
        employee2.printEmployeee();
        
        System.out.println("---------------------");
        
        Employeee employee3 = new Employeee("Brandon Johnson");
        employee3.age = 35;
        employee3.designation = "Sales Executive";
        employee3.salary = 45000.0;
        employee3.printEmployeee();
    }
}
