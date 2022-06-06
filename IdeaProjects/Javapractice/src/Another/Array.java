package Another;

public class Array {
    public static void main(String[] args) {


       /* int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
        System.out.println(a[3]); */
 int a[]={100,200,300,400,500,600};// first starts with 0
       System.out.println(a.length);
        System.out.println(a[5]);// size of array
        System.out.println(a[0]);
      for(int i=0; i<a.length;i++){ // for loop
           System.out.println(a[i]);}
        for(int i:a)  // for each loop // enhanced for loop
            System.out.println(i);//
}}
