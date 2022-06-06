public class StringDay {
    public static void main(String[] args) {
        int Day = 6;
        switch(Day) {
            case 1, 2, 3, 4, 5 :
                System.out.println("Weekdays"); break;
            case 6, 7 :
                System.out.println("weekend ");break;
                default : System.out.println("Invalid day");
        };
        double a = 4321 ;
        double b = 1234;
        System.out.println(a/b);
    }
}