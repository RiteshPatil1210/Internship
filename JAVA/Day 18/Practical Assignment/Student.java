
public class Student{
    int id;
    String name;
   double percentage;
        public Student(int id,String name,double percentage) {
            this.id=id;
            this.name=name;
            this.percentage=percentage;
            
        }
        public static void main(String[] args) {
            Student e=new Student(102, "Ritesh",90);
            Student e1=new Student(103, "sai",89 );
            System.out.println("Name:"+e.name+"  id:"+e.id+" Percentage"+e.percentage);
            System.out.println("Name:"+e1.name+"  id:"+e1.id+" percentage:"+e1.percentage);
        }
        
     
    }
    
