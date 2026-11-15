 import java.util.Scanner;
 public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        if (decimal == 0) {
            System.out.println("Binary: 0");
        }
         else {
            String binary = "";
            int num = decimal;

            while (num > 0) {
                int r = num % 2;
                binary =  binary + r; 
                num = num / 2;
            }

            System.out.println("Binary: " + binary);
        }

        scanner.close();
    }
}
    

