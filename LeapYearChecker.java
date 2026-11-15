 import java.util.Scanner;
public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Using ternary operator to check if the year is a leap year
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap year" : "Not a leap year";

        System.out.println(year + " is " + result);

        scanner.close();
    }
    
}
