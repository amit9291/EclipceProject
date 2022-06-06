package javapractice;
interface Printable{
	
}
	interface Showable{

	}
		
 class Interface implements Printable,Showable {
	public void print(){System.out.println("Printing");}
	public void show() {System.out.println("Showing");}

	public static void main(String[] args) {
		Interface i= new Interface();
		i.print();
		i.show();
	

	}

}
