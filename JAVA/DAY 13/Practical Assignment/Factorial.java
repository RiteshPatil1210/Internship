
package Demo15;
import java.lang.*;
public class Factorial {

	public static void main(String[] args) {
	int n=10;
	
	for(int i=1;i<=n;i++) {
		int factorial=1;
		for(int j=1; j<=i;j++) {
			factorial*=j;
		}
		System.out.println("Factorial of "+i+" : "+factorial);
	}
		

	}

}
