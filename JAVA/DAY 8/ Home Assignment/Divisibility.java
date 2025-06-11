package Demo15;
import java.util.*;
public class Divisibility {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no:");
		int a=sc.nextInt();
		if(a%5==0) {
			System.out.println("No is divisible by 5");
		}else if(a%11==0){
			System.out.println("No is divisible by 11");
		}else {
			System.out.println("No is not divisible by 5 and 11");
		}
	}

}
