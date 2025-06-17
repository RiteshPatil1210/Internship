class Shape{
    void area(){
        System.out.println("Area of Shape:");
    }
}
class Circle extends Shape{
    int r=10;
    @Override
    void area(){
        System.out.println("Area of Circle:"+3.14*r*r);
    }
}

class Rectangle extends Shape{
    int l=10;
    int b=5;
    @Override
    void area(){
        System.out.println("Area of Rectangle:"+l*b);
    }
}


public class Main2 {
    public static void main(String args[]){
Rectangle r=new Rectangle();
Circle c = new Circle();
r.area();
c.area();
    }
    
}
