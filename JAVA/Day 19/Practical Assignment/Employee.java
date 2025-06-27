

public class Employee {
    int id;
    String name;
    public Employee(int id,String name){
 this.id=id;
this.name=name;
    }
     Employee(Employee e){
this.id=e.id;
this.name=e.name;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("id:"+id);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(111,"Ritesh");
Employee e2=new Employee(e1);
System.out.println("original");
e1.display();
System.out.println("Copied");
e2.display();

    }
}
