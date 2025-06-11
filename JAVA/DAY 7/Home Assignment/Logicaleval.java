package Demo15;

import java.util.*;
class Logicaleval{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b,c,d:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=0;
System.out.println("Ans:"+((a+b)*(c-d)/e));
}
}
//If e is 0, you will get a runtime error:
//In Java, division by zero for integers throws an exception: