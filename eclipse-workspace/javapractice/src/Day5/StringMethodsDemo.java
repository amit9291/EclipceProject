package Day5;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = " to new learning ";
	//int len= s.length()+s1.length()
//System.out.println(len);
	
  System.out.println(s+s1);
  System.out.println(s.concat(s1));
  s= "    Java programming   ";
  System.out.println(s);
  System.out.println(s.trim());
  // CharAt()
  s="Welcome";
  System.out.println(s.charAt(5));
  System.out.println(s.contains("com"));
  System.out.println(s.equals("welcome"));
  System.out.println(s.equalsIgnoreCase("welcome"));
  //Replace()
  s="welcome to java welcome to selenium";
  System.out.println(s.replace('e', '1'));
  System.out.println(s.replace("welcome", "nelcome"));
  //substring()
  s="welcome";
  System.out.println(s.substring(0,4));
  // toLowerCase & toUpperCase
  s="welCOme";
  System.out.println(s.toUpperCase());
  System.out.println(s.toLowerCase());
  //reverse
  s=" a b c d e f g h i j k l m n o p q r s t w x y z ";
  int len = s.length();
  
  String rev="";

  for(int i=len-1; i>=0;i--)
  {
    rev=rev+s.charAt(i);
  }
  System.out.println("reverse string is :"+ rev);
  
 // String presence in array
  
 String t[]= {"welcome","selenium","java","python","javascript"};
 
 String searchstring= "python";
 boolean flag = false;
 
 for(String i:t) {
 if(i.equals(searchstring))
 {
	 System.out.println("String found in array");
	 flag= true;
	 break;
 }}
 if(flag==false)
 {
	 System.out.println("String not found in array");
 }
 
 }
 
  }
	


 