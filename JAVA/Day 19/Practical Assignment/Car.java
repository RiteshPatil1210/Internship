

public class Car {
    String color;
    public Car(String color){
this.color=color;
    }
    Car(Car c){
        this.color=c.color;
    }
    void display(){
        System.out.println("Color:"+color);
    }
    public static void main(String[] args) {
        Car c=new Car("Red");
        Car c1=new Car(c);
        System.out.println("Original constructor");
        c.display();
        System.out.println("Copied Constructor");
        c1.display();
    }
}
