package Demo15;

public class Product {
	String p;
	int pr;
	Product(String p,int pr){
		this.p=p;
		this.pr=pr;
	}
	void displaydetails() {
		System.out.println("Product Name:"+p);
		System.out.println("Price:"+pr);
	}
	public static void main(String args[]) {
		Product p1=new Product("Sugar",100);
		p1.displaydetails();
		Product p2=new Product("Shampoo",200);
		p2.displaydetails();
		Product p3=new Product("Maggie",30);
		p3.displaydetails();
	}

}
