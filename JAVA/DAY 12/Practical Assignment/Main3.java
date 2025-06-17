abstract class Vehicle{
     void start(){

    }
}
class Car extends Vehicle{
    @Override
    void start(){
System.out.println("Car is Starting");
   }
}
class Bike extends Vehicle{
    @Override
    void start(){
System.out.println("Bike is Starting");
   }
}


public class Main3 {
    public static void main(String args[]){
Bike b=new Bike();
b.start();
Car c=new Car();
c.start();

    }
    
}
