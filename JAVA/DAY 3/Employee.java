package Demo15;

public class Employee {
    String name;
 int id;

 
 static int employeeCount = 0;

 
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
     employeeCount++;     }


 public void display() {
     System.out.println("Employee ID: " + id + ", Name: " + name);
 }

 public static void main(String[] args) {
     Employee emp1 = new Employee("Amit", 1);
     Employee emp2 = new Employee("Sneha", 2);

     emp1.display();
     emp2.display();

     System.out.println("Total Employees: " + Employee.employeeCount);
 }
}