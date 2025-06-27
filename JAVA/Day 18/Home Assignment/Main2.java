


class Parent{
    void display(){
System.out.println("Hello");

}
}
class Child extends Parent{
   
    void display(){
        System.out.println("Mesaage from parent class");
        super.display();
    }
}
public class Main2 {
public static void main(String[] args) {
    Child p =new Child();
    p.display();
}
    
}
