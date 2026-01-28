package day_02;
import java.util.Scanner;
public class arithmetic_operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b =sc.nextInt();
		int add=a+b;
		int sub=a-b;
		int pro=a*b;
		int div=a/b;
		System.out.println("add="+add);
		System.out.println("sub="+sub);
		System.out.println("pro="+pro);
		System.out.println("div="+div);
		
	}

}
