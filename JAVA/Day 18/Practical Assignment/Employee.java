
public class Employee{
int id;
String name;
double salary;
    public Employee(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public static void main(String[] args) {
        Employee e=new Employee(102, "Ritesh", 50000.00);
        Employee e1=new Employee(103, "sai", 10000.00);
        System.out.println("Name:"+e.name+"  id:"+e.id+"  Salary:"+e.salary);
        System.out.println("Name:"+e1.name+"  id:"+e1.id+"  Salary:"+e1.salary);
    }
    
 
}
