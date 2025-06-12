package Demo15;

public class Split4 {
    public static void main(String args[]) {
        String s = "My, name, is, Ritesh";
        String[] details = s.split(",");
        
        for (String detail : details) {
            System.out.println(detail); 
        }
    }
}

