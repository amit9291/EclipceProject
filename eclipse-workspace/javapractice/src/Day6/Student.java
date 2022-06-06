package Day6;

class Student {
		int sid;
		String sname;
		char grade;
	Student(int id , String name, char g)	
	{
		sid=id;
		sname=name;
		grade=g;
		
	}
	
		void getValues(int id , String name, char g)
		{
			sid=id;
			sname=name;
			grade=g;
		    
			
		}
		
	
void dispaly() {

	System.out.println(sid);
	System.out.println(sname);
	System.out.println(grade);
}
}
	/*class Student1{

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2= new Student();
		s1.id=101;
		s1.name="Amit";
		s2.id=102;
		s2.name="Jiaan";
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}*/

	


