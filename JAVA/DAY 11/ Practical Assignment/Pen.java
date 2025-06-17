package Demo15;

public class Pen {
	String brand="Monster";
	String color="Green";
	void display() {
		System.out.println("Brand name:"+brand);
		System.out.println("Color:"+color);
		}
	public static void main (String args[]) {
		Pen p=new Pen();
		p.display();
		
	}

}
