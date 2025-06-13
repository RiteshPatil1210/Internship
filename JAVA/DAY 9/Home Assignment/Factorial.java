package Demo15;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter n:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int factorial=1;
		for(int j=1; j<=i;j++) {
			factorial*=j;
		}
		System.out.println("Factorial of "+i+" : "+factorial);
	}
		

	}

}
