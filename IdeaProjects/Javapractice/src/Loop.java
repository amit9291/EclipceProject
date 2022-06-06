public class Loop {
    public static void main(String[] args) {
        int i, fact = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + number + " is : " + fact);
        double p, r, t, si;// principal amount, rate of interest, time and simple interest respectively ,
        p = 1000.250;
        r = 2.75;
        t = 2;
        si = (p * r * t) / 100;
        System.out.println("simple interest is : " + si);

         for( int a=1;a<=10; a++){
             a+=1;
            System.out.println(a);
        }
    }}


