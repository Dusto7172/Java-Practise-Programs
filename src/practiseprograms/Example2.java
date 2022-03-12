package practiseprograms;

import java.util.Scanner;

public class Example2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Numbers");
	int a =sc.nextInt();
	System.out.println("a:"+a);
	int b = sc.nextInt();
	System.out.println("b:"+b);
	int x=multiplication(a,b);
	System.out.println("product of a & b:"+x);
	}

	public static int multiplication(int a,int b)
	{
	int res = a*b;
	return res;

}
}