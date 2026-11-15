import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        double denominator = 2.0; 
        int i = 1; 

        while (i <= n) {
            sum += i / denominator;
            denominator = denominator * 2;
            i++; 
        }

        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}
    
    
