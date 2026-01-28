package day_02;

public class swap_without_temp {
	public static void main (String[] args) {
		int a=9;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
