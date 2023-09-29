package BMI;
import java.lang.Math;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("weight : ");
        // double is also avalible
        int weight = scanner.nextInt();
        System.out.print("height : ");
        double height = scanner.nextDouble();
        int index = 2;
        double bms = Math.pow(height, index);
        double result = weight / bms;
        System.out.println("Your BMI:" + result + "(kg/m2).");

        // Expected input
        // Enter your weight (kg): 51
        // Enter your height (m): 1.63

        // Expected output
        // Your BMI: 19.195302796492154 (kg/m2)

        // /Users/daichiishikawa/IdeaProjects/Tutorial3/src/BMI
        //  java BMI.java
        // https://www.w3schools.com/java/java_user_input.asp


        // comment
//        double weight = 51;
//        double height = 1.63;
//        double bmi = weight / (height * 2);
//        int index = 2;
//        double bms = Math.pow(height, index);
//        double result = weight / bms;
//        System.out.println(bmi);
//        System.out.println(bms);
//        System.out.println(result);
//        System.out.println("Your BMI:" + result + "(kg/m2).");
//        Your BMI: 19.195302796492154 (kg/m2)
        // comment
    }
}
