
public class Student {
    int id;
    String name;
    int marks;
    public Student( int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
        System.out.println("id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);

    }
    public static void main(String[] args) {
        Student s=new Student(11,"Ritesh",455);
    }
    
}
