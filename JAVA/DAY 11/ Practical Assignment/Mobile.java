package Demo15;

public class Mobile {
	String m;
	int p;
	void display() {
		System.out.println("Model Name:"+m);
		System.out.println("Price:"+p);
		}
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.m="i phone 14";
		m1.p=80000;
		Mobile m2=new Mobile();
		m2.m="Vivo v28 pro";
		m2.p=50000;
		m1.display();
		m2.display();
		
		
		}

}
