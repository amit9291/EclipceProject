public class Ifelse {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("age is greater than 18 - welcome");
        } else {
            System.out.println("age is less than 18 - do not allow ");
        }
        int number = 21;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        int marks = 65;
        if (marks < 50) {
            System.out.println("FAIL");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B Garde");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade Well done");
        } else {
            System.out.println("ERROR");
        }
        int Age =20;
        int weight =49;
        if (Age >= 18) {
            if (weight >= 50) {
                System.out.println("you can donate blood");
            }else{
                System.out.println("you can't");
            }
        }
    }
}








