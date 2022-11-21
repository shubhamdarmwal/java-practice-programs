package myfirst;

public class Checknumber {

	public static void main(String[] args) {
		
		int num = 77777;
		
		if (num<100 && num>9)
		{
			System.out.println(num+" is a 2 digit number");
		}
		else if (num<1000 && num>99)
		{
			System.out.println(num+" is a 3 digit number");
		}
		else if (num<10000 && num>999)
		{
			System.out.println(num+" is a 4 digit number");
		}
		else 
		{
			System.out.println(num+" is not between 9 to 9999 range");
		}
	}
}
