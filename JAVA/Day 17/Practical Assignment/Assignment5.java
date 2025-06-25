
import java.io.*;

public class Assignment5 {
    public static void main(String[] args)throws IOException {
        
            FileReader f=new FileReader("Ritesh.txt");
            int ch;
        while((ch=f.read())!=-1){
            System.out.println((char)ch);
        }
        f.close();
    }
}
