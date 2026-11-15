import java.util.Scanner;
public class NumberSwap {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the first number: ");
        a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        b = scanner.nextInt();

        System.out.println("Before swap: a = "+ a + ", b = "+ b);

        System.out.println("After swap: a = "+ b + ", b = "+ a);

        scanner.close();
    
    }
    
}
