import java.util.*;

public class Assignmemt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the index of an array:");
            int a=sc.nextInt();
            for(int i =0;i<=a;i++){
System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
    
}
