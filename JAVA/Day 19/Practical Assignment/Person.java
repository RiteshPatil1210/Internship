

public class Person {
    String name;
    int age;
    public Person(){
name="unknown";
age=0;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    public static void main(String[] args) {
        Person p1=new Person();
        p1.display();
    }
}
