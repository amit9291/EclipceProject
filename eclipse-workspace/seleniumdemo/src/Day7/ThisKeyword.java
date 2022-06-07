package Day7;

public class ThisKeyword {

	int a,b;
	/*void add(int a, int b) {
		this.a=a;
		this.b=b;
	}*/
	ThisKeyword(int a , int b){
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum of a & b is : " +(a+b));
	}
	
	public static void main(String[] args) {
		ThisKeyword th= new ThisKeyword(10,20);
		//th.add(10,20);
		th.display();

	}

}
