class Product{
    private int productid;
    private String name;
    private int price;
    void set(int productid,String name,int price){
        this.productid=productid;
        this.name=name;
        this.price=price;
        }
        void get(){
System.out.println("Product id:"+productid);
System.out.println("Name:"+name);
System.out.println("Price:"+price);
 }
}
public class Main2 {
    public static void main(String args[]){
   Product p=new Product();
   p.set(12633,"Ritesh",5000);
   p.get();
    }
}
