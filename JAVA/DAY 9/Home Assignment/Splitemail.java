package Demo15;
import java.util.*;
public class Splitemail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address:");
		String s=sc.nextLine();
		String[]details=s.split("@");
		for(String detail:details) {
			System.out.println(detail);
		}
		

	}

}
