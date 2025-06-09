package Demo15;
import java.util.*;
public class Temperature {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter Temperature:");
			double t=sc.nextDouble();
			if(t>35) {
				System.out.print("Temperature is hot");
			}else {
				System.out.print("Temperature is normal");
			}
			
		
	}

}
