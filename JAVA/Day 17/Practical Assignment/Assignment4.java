

public class Assignment4 {
    public void show(){
        String s="HI";
        System.out.println(s);
    }
    public static void main(String[] args) {
        try {
            Assignment4 o=null;
            
            o.show();
        } catch ( Exception e) {
            System.out.println("Null pointer Exception");
        }
    }
    
}
