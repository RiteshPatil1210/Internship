package Demo15;

public class Splithw {
	public static void main(String args[]) {
		String s="Hello? How are you? Good!";
				String[] detail= s.split("\\?\\s*");
				for( String details : detail) {
					System.out.print(details);
				}
	}

}
