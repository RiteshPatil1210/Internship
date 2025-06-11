package Demo15;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.print("Enter Grade:");
		String s=sc.nextLine();
		switch(s){
		case "a":
			System.out.print("Excellent");
			break;
		case "b":
			System.out.print("Good");
			break;
		case "c":
			System.out.print("Average");
			break;
		case "d":
			System.out.print("Below Average");
			break;
		case "f":
			System.out.print("Fail");
			break;
			default:
				System.out.print("Invalid Grade");
			

	}

}
}
