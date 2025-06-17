interface Printable{
void print();
}
class Document implements Printable{
   public void print(){
System.out.println("Document is printing");
    }
}
class Photo implements Printable{
    public void print(){
 System.out.println("Photo is printing");
     }
 }
public class Main4 {
    public static void main(String args[]){
        Document d=new Document();
        d.print();
        Photo p =new Photo();
        p.print();
    }
    
}
