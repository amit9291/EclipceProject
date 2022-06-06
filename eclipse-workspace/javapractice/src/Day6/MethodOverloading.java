package Day6;

public class MethodOverloading {
	
	int x,y;
	double z;
	
	int addition()
	{
		x=10;
		y=20;
	return(x+y);
	}
	int addition(int a, int b)
	{
		x=a;
		y=b;
		return(x+y);
	}
	double addition(int a, double b)
	{
		x=a;
		z=b;
		return(x+z);
	}
	double addition(int a, int b, double c)
	{
		x=a;
		y=b;
		z=c;
		return(x+y+z);
	}
void main()
{
	System.out.println("This is Main Method....");
}
	public static void main(String[] args) {
	
		MethodOverloading mo= new MethodOverloading();
		System.out.println(mo.addition());
		System.out.println(mo.addition(100,200));
		System.out.println(mo.addition(100,20.999));
		System.out.println(mo.addition(100,200,20.50));
		mo.main();
	}

}
