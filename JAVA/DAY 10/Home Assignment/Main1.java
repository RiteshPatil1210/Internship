
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}


class Circle extends Shape {
    double radius;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}


class Rectangle extends Shape {
    double length, breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Main1 {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.radius = 7;             
        c.display();
        c.calculateArea();

        Rectangle r = new Rectangle();
        r.length = 5;
        r.breadth = 3;
        r.display();
        r.calculateArea();
    }
}
