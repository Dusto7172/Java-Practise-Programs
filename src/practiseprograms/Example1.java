package practiseprograms;

public class Example1 {
	
	public static void main(String[] args) {
		Example1 e = new Example1();
		e.solution1(5,8,6);
		solution2(55,9,9);
		solution3(20,3,5,8);
		solution4(5,15,3,2,8,3);
	}
	 public  void solution1(int a,int b,int c) //method declaration
	    {
	        int x = -a + b*c;
			System.out.println("x:"+x);
	    }
	 public static void solution2(int a,int b,int c) //method declaration
	    {
	        int y = (a + b)%c;
			System.out.println("y:"+y);
	    }
	 public static void solution3(int a,int b,int c,int d) //method declaration
	    {
	        int z = a+(-b)*c/d;
			System.out.println("z:"+z);
	    }
	 public static void solution4(int a,int b,int c,int d,int e,int f) //method declaration
	    {
	        int v = a+b/c*d-e%f;
			System.out.println("v:"+v);
	    }
	
	 
}
