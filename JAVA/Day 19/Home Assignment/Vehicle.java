public class Vehicle {
    String type;
    int wheels;

    Vehicle(String t, int w) {
        type = t;
        wheels = w;
    }

    Vehicle(Vehicle v) {
        type = v.type;
        wheels = v.wheels;
    }

    void show() {
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Bike", 2);
        Vehicle v2 = new Vehicle(v1);
        v2.show();
    }
}
