package Demo15;
import java.util.*;
public class Logical {
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("ENTER MARKS:");
	int mark=sc.nextInt();
	sc.nextLine();
	if((mark>=40)||(mark==0)) {
	System.out.println("PASS");
	}else{
		System.out.println("FAIL");
	}
	
}
}

