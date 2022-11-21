package myfirst;

public class Array2D {

	public static void main(String[] args) {
		
		 int[][] arr = { { 1, 2 }, { 3, 4 } };
		 
	        for (int i = 0; i < 2; i++)
	        {
	            for (int j = 0; j < 2; j++)
	            {
	            	System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);
	            }  
	        }
	        /*int a[][] = {{1, 2}, {3, 4}};
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                sum += a[i][j];
            }
        }
        System.out.println("sum = " + sum); */
	}
}
