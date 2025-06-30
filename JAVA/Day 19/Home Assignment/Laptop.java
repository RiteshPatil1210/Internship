public class Laptop {
    String model;
    double price;

    Laptop(String m, double p) {
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 50000);
        l1.display();
    }
}

