package practiseprograms;

import java.util.Scanner;

public class Example3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Numbers");
	System.out.println("Input first number:");
	int a =sc.nextInt();
	System.out.println("Input second number:");
	int b = sc.nextInt();
	int u=addition(a,b);
	int v=substraction(a,b);
	int w=multiplication(a,b);
	int x=division(a,b);
	int y=mod(a,b);
	System.out.println("addition of a & b:"+u);
	System.out.println("Substraction of a & b:"+v);
	System.out.println("Division of a & b:"+w);
	System.out.println("Multiplication of a & b:"+x);
	System.out.println("Mod of a & b:"+y);
	}

	public static int addition(int a,int b)
	{
	int res = a+b;
	return res;
	}
	
	public static int substraction(int a,int b)
	{
	int res = a-b;
	return res;
	
	}
	public static int multiplication(int a,int b)
	{
	int res = a*b;
	return res;
	}
	
	public static int division(int a,int b)
	{
	int res = a/b;
	return res;
	}
	
	public static int mod(int a,int b)
	{
	int res = a%b;
	return res;
	}
}