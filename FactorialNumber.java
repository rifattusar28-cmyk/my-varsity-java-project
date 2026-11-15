import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int num, fact = 1, i;
        System.out.print("Enter any positive number: ");
        num = scanner.nextInt();

        for(i = 1 ; i<= num; i++){
            fact = fact*i;
        }
        System.out.println("The factorial of num is "+ fact);
    scanner.close();

    }
    
}
