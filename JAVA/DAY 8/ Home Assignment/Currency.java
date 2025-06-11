package Demo15;
import java.util.*;
public class Currency {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Currency code:");
		String c=sc.nextLine();
		switch(c) {
		case "INR":
			System.out.println("Currency Symbol:"+"₹");
			break;
		case "USD":
			System.out.println("Currency Symbol:"+"$");
			break;
		case "EUR":
			System.out.println("Currency Symbol:"+"€");
			break;
		case "GBP":
			System.out.println("Currency Symbol:"+"£");
			break;
			default:
				System.out.println("Invalid Currency code");
				}
		
		}

}
