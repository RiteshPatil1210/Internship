package Demo15;
import java.util.*;

public class Bitwise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int a=sc.nextInt();
		if((a==60) || (a>60)) {
			System.out.println("Senior citizen");
		}else if((a==0) || a<=18) {
			System.out.println("Child");
		}else {
			System.out.println("The person is adult");
		}
		

	}

}
