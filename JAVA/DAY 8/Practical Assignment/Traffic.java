package Demo15;
import java.util.Scanner;
public class Traffic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.print("Enter Color:");
		String s=sc.nextLine();
		switch(s){
		case "Red":
			System.out.print("Stop");
			break;
		case "Yellow":
			System.out.print("Ready");
			break;
		case "Green":
			System.out.print("Go");
			break;
			default:
				System.out.print("invalid input");
				break;
		}
	}
}

				
