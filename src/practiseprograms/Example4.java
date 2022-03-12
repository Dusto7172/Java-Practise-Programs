package practiseprograms;

import java.util.Scanner;

public class Example4 {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Numbers");
	int a =sc.nextInt();
	for(int i = 0;i<=10;i++) {
		System.out.println(a + " x " + (i+1) + " = " + a * (i+1));

	}
	
}
	
}