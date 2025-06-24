import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 no.:");
        int a=sc.nextInt();
        System.out.println("Enter 2 no.:");
        int b=sc.nextInt();
        try {
            System.out.println("Ans:"+a/b);
        } catch (Exception e) {
            System.out.println("Arithmetic exception");
        
        }

    }
    
}
