package LeapYear;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        boolean result;

        // creates an object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("year : ");
        int year = scanner.nextInt();
        result = isLeapYears(year);
        if (result) {
            System.out.println("The year " + year + " is a leap year.");
        }else{
            System.out.println("The year " + year + " is not a leap year.");
        }
        // comment
//        boolean result;
//        int year = Integer.parseInt(args[0]);
//        result = isLeapYears(year);
//        if (result) {
//            System.out.println("The year " + year + "is a leap year.");
//        }else{
//            System.out.println("The year " + year + "is not a leap year.");
//        }
        // comment
    }

    public static boolean isLeapYears(int year) {
        if (year % 4 == 0) {
            return true;
        }else{
            return false;
        }
    }



}
