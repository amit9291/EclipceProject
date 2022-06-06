public class Secondclass {
    public static void main(String[] args) {
        int a = 5;
        int b= 2;
        int c = 7;
        float  v =(float)(a/b);
        System.out.println("a = "+(a));// string + feed
        System.out.println(v);
        System.out.println(a>>b);
         // 5/2^2=5/4=1
        System.out.println(20>>>2);// 20/2^2=20/4=5
        System.out.println(-19>>>2); //unknown
        System.out.println(b>a|c++>a);// checks both condition
        System.out.println(c);
        System.out.println(10>5||10>5);// checks second if 1st is true
        int min = (a>b)?a:b;//
        System.out.println(min);
        a+= 3;//a=a+3
        b-= 1;//b=b-1
        System.out.println(a);
        System.out.println(b);
        a+=2;// adds 2 to last a value
        System.out.println(a);
        a-=1;// minus 1 to last a value
        System.out.println(a);
        a*=3;// multiply by 3 to last a value
        System.out.println(a);
        a/=2;// devided by 2 to last a value
        System.out.println(a);
        a+=b;// confusion ???
        System.out.println(a);
        int e =10;
        int f = 10;
        e+=f;
        System.out.println("e is ="+(e));
        short s = 12;
        short t = 13;
        t= (short)(s+t);
        System.out.println(t);


    }
}
