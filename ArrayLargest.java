package myfirst;

public class ArrayLargest {

	public static void main(String[] args) {
		
		int num[] = {1,3,6,20,4,8,3,45,32,55};
		int max = num[0];
		for(int i=0;i<10;i++)
		{
			if (num[i]>max)
			{
				max = num[i];
			}
		}
		System.out.println(max);
	}

}
