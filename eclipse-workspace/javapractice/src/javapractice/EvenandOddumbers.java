package javapractice;

public class EvenandOddumbers {

	public static void main(String[] args) {
int a[]= {10,15,20,25,30,35,40,45,50};
System.out.println("Even numbers are : ");
for (int i:a)
{
	if(i%2==0)
	{
		System.out.print(i+" ");
	}
}
System.out.println();
System.out.println("Odd numbers are : ");
for (int i:a)
{
  if(i%2!=0)
{
	System.out.print(i+" ");
}
	}
	}
}


