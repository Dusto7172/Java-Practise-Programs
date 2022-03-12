package practiseprograms;

public class Example7 {
	static double r = 7.5;
public static double perimeter(double res) {

	res = 2*3.14*r;
	System.out.println("Perimeter is:"+res);
	return res;
}
public static double area(double res) {

	res = 3.14*(r*r);
	System.out.println("Area is:"+res);
	return res;
}	
public static void main(String[] args) {
	System.out.println("radius"+r);
	perimeter(r);
	area(r);
}

}