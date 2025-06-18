class Animal{
    void makesound(){

    }
}
class Dog extends Animal{
    @Override
    void makesound(){
System.out.println("Barking");
    }
}
class Cat extends Animal{
    @Override
    void makesound(){
System.out.println("Meow Meow");
}
}
public class Main1{
 public static void main(String args[]){
   Cat c=new Cat();
   c.makesound();
   Dog d=new Dog();
   d.makesound();

 }
}

