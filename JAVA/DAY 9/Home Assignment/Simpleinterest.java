package Demo15;
import java.util.*;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter P:");
		int p = sc.nextInt();
		System.out.println("Enter R:");
		int r = sc.nextInt();
		System.out.println("Enter T:");
		int t = sc.nextInt();
		
		System.out.println("Simple interest:"+(p*r*t/100));

	}

}
