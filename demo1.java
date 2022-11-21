/**
 * 
 */
package myfirst;

/**
 * @author sdarmwal 
 *
 */
public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b;
		a = 100;
		b =2000;
		
		if (a>b)
		{
			int d = a-b;
			System.out.println(d);
		}
		else
		{
			int d = b-a;
			System.out.println(d);
		}
		
		
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
