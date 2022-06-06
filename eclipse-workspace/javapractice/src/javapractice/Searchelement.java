package javapractice;

public class Searchelement {

	public static void main(String[] args) {
		int a[]= {10,200,100,30,50,70};
		int num =70;
		boolean flag=false;
		for(int i:a)
		{
			//System.out.println(i);
			if(i==num)
			{
				System.out.println("Element Found ");
				flag=true;
				break;
			}
		}
		if(flag==false) 
		{
			
System.out.println("Element Not Found");
		}
		}
	}


