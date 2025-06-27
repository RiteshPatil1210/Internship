class Student{
    int id;
Student(int id){
this.id=id;
}
}

class Result extends Student{
    int marks;
   Result(int id,int marks){
    super(id);
this.marks=marks;

    System.out.println("ID:"+id);
    System.out.println("Marks:"+marks);
    
   }
   
   

}
public class Main4 {
public static void main(String[] args) {
    Result r=new Result(223061305,95);

}
    
}