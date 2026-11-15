import java.util.Scanner;

public class SumOfDigits { 
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        int num, sum = 0, r, temp,i;

        System.err.print("Enter any positive number: ");
        num = scanner.nextInt();

        temp = num;
        while(temp != 0){
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
   
        System.out.println("The sum of disits "+ sum );
    scanner.close();

    }
    
}
