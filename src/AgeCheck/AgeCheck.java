package AgeCheck;
import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("age is : ");
        // age must be int
        int age = scanner.nextInt();
        String result;
        if (age < 13) {
            result = "Not for kids!";
        }else{
             result = age > 19 ? "You're too old!" : "Welcome, teenager!";
        }
        System.out.println(result);

        // Expected input
        // case 1 age == 3
        // Expected output
        // Not for kids!

        // Expected input
        // case 2 age == 13
        // Expected output
        // Welcome, teenager!

        // Expected input
        // case 2 age == 20
        // Expected output
        // You're too old!

        // comment
//        if (args[0]){
//            int age = Integer.parseInt(args[0]);
//        }
//        String result;
//        if (age < 13) {
////            System.out.println("Not for kids!");
//            result = "Not for kids!";
//        }else{
//             result = age > 19 ? "You're too old!" : "Welcome, teenager!";
//        }
//        System.out.println(result);
        // comment
    }
}
