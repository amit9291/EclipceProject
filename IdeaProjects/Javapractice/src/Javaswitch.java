import java.sql.SQLOutput;

public class Javaswitch {
    public static void main (String[] args){
        int value=10;

        switch(value) {
            case 10: System.out.println("TEN");
                break;
            case 20: System.out.println("TWENTY");
                break;
            case 15: System.out.println("FIFTEEN");
                break;
            default: System.out.println("INVALID");
        }    int month =2;
        switch(month){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
                break;
            case 6  : System.out.println("June");
                break;
            case 7 : System.out.println("July");
                break;
            case 8 : System.out.println("August");
                break;
            case 9 : System.out.println("September");
                break;
            case 10 : System.out.println("October");
                break;
            case 11 : System.out.println("November");
                break;
            case (12) : System.out.println("December");
                break;
            default: System.out.println("Invalid");
        }
        int a = 10;int b = 12; int c = 40;
        switch (a){
            case 12 :
                System.out.println(b);
                break;
            default:
                System.out.println(c);
        }

    }
}

