package myfirst;

public class MultiplyOverload {
	
	int a,b;
	int mul(int a, int b)
	{
		return a*b;
	}
	
	int mul(int a, int b, int c)
	{
		return a*b*c;
	}
	
	int mul(int a, int b, int c, int d)
	{
		return a*b*c*d;
	}

	public static void main(String[] args) {
		
		MultiplyOverload s1 = new MultiplyOverload();
		
		System.out.println(s1.mul(10,20));
		System.out.println(s1.mul(10,20,30));
		System.out.println(s1.mul(10,20,30,40));
		
	}

}
