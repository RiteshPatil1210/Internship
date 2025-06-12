package Demo15;

public class Swap {
public static void main(String args[]) {
	int a=20;
	int b=15;
	System.out.println("Before Swapping A:"+a);
	System.out.println("Before Swapping B:"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping A:"+a);
	System.out.println("After Swapping B:"+b);
	
	
}
}
