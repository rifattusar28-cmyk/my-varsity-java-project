import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num, first = 0, second = 1, fibo, i ;

        System.out.print("How many number: ");
        num = scanner.nextInt();
        
        System.out.println(" "+first);
        System.out.println(" "+second);

        for(i = 3 ; i<= num; i++){
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.println(" " + fibo);

            scanner.close();

        }

    }
    
}
