class Student{
    private String name;
    private int age;
    void set(String name,int age){
       this.name=name;
       this.age=age; 
    }
    void get(){
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
    }
}
public class Main5 {
    public static void main (String args[]){
Student s=new Student();
s.set("Ritesh",18);
s.get();

    }
}
