package Demo15;
import java.util.*;
public class Leapyear {
public static void main(String arfgs[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year:");
	int a=sc.nextInt();
	if(a%4 ==0) {
		System.out.println("LEAP YEAR");
	}else {
		System.out.println("NOT A LEAP YEAR");
	}
	
}
}
