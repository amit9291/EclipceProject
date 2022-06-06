package javapractice;

public class array {

	public static void main(String[] args) {
	/*	int a[] = new int [5];
		a[0]= 100;
		a[1]= 200;
		a[2]= 300;
		a[3]= 400;
		a[4]= 100;
		System.out.println(a[3]);  */
//	int a[]	= {100,200,300,400,500,600,700};
//	System.out.println(a.length);
	//	System.out.println(a[0]);	
// classic 
     /* for(int i=0; i<a.length ; i++)
      
      System.out.println(a[i]); */
      // for each loop 
      
  //   for(int i:a) 
  //  	 System.out.println(i);
    int a [][]= {{100,200},{300,400},{500,600}};
    System.out.println("Number of row " +a.length);
    System.out.println("Number of colums "  +a[0].length);
    
  /*  for(int i=0;i<a.length;i++)
    {
    	for (int j=0;j<a[i].length;j++)
    	{
    		System.out.println(a[i][j]);
    	}
    }*/
    	
    for (int r[]:a)
    	{
    		for(int i:r)
    		{
    			System.out.print(i+" ");
    		}
    		System.out.println();
    	}
	}
}
