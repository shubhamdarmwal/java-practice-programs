package myfirst;

public class Array1 {

	public static void main(String[] args) {
		int[] num = new int[6];
		
		num[0] = 10;
		num[1] = 100;
		num[2] = 1000;
		num[3] = 10000;
		num[4] = 100000;
		num[5] = 1000000;
		
		for(int i =0; i<6;i++)
		{
			System.out.println(num[i]);
		}
		
		
		int num1[] = {1,3,6,20,4,8,3,45,32,55};
		
		for(int i =0; i<10;i++)
		{
			System.out.println(num1[i]);
		}

	}

}
