package myfirst;

public class ascending {

	public static void main(String[] args) {
		
		 int [] arr = {1,3,6,20,4,8,3,45,32,55};     
	        int temp = 0;    
	              
	        System.out.println("Given order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }          
	        System.out.println();    
	              
	        System.out.println("Ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    

	}

}
