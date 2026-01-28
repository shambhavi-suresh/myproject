package day_02;
import java.util.Scanner;
public class swapnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("Before Swap");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("after swap");
		int temp=a;
		a=b;
	    b=temp;
	    System.out.println("a="+a);
	    System.out.println("b="+b);
				
	}
	

}
