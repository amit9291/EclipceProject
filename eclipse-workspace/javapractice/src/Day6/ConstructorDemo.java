package Day6;

public class ConstructorDemo {

	int x,y,z;
	
/*	ConstructorDemo()
	{
	x=100;
	y=200;
	System.out.println(x+y);

	}*/
	ConstructorDemo (int a , int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	ConstructorDemo (int a , int b, int c )
	{
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		ConstructorDemo cm = new ConstructorDemo(10,20,30);

	}

}
