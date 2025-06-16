class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
        sound(); // calling parent class method
    }
}

public class Single {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
