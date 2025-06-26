public class Constructor2 {
    String name;
    int age;
    String city;

    public Constructor2() {
        name = "Unknown";
        age = 0;
        city = "Unknown";
    }

    public Constructor2(String name) {
        this.name = name;
        age = 0;
        city = "Unknown";
    }

    public Constructor2(String name, int age) {
        this.name = name;
        this.age = age;
        city = "Unknown";
    }

    public Constructor2(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Constructor2 p1 = new Constructor2("Ritesh");
        Constructor2 p2 = new Constructor2("Ritesh",19);
        Constructor2 p3 = new Constructor2("Ritesh",19,"Nashik");
        p1.display();
        p2.display();
        p3.display();
    }
}