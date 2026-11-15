import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        double cels, farn;

        System.out.println("Enter Celsius");
        cels = scanner.nextDouble();

        farn = 1.8 * cels + 32; 

        System.out.println("Fahrenheit "+ farn);

        scanner.close();

    }
}
