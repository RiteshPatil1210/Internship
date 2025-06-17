package Demo15;

public class Laptop {
	String m="Macbook air m2";
	String color="Space black";
	void displaydetails() {
		System.out.println("Model:"+m);
		System.out.println("Color:"+color);
	}
public static void main(String args[]) {
	Laptop l=new Laptop();
	l.displaydetails();
}

	
}
