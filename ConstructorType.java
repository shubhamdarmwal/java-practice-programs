package myfirst;

public class ConstructorType {
	
	 	double w;
	    double h;
	    double d;
	    ConstructorType() 
	    {
		w = 10;
		h = 10;
		d = 10;
	    }
	
	ConstructorType(double w, double h, double d)
	{
		 w =10;
		 h = 20;
		 d = 30;
	}
	
	double volume()
	{
		return w*h*d ;
	}

	public static void main(String[] args) {
		ConstructorType t1 = new ConstructorType();
		System.out.println("Volume of the first object is " + t1.volume());
		
		ConstructorType t2 = new ConstructorType(5,10,15);
		System.out.println("Volume of the second object is " + t2.volume());
		
		ConstructorType t3 = new ConstructorType(5,1,5);
		System.out.println("Volume of the third object is " + t3.volume());
		
		ConstructorType t4 = new ConstructorType(50,100,150);
		System.out.println("Volume of the fourth object is " + t4.volume());

	}

}
