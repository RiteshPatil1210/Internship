
import java.io.*;
public class Assignment6 {
    public static void main(String[] args) throws IOException{
        try {
            FileReader f=new FileReader("Ritesh.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
