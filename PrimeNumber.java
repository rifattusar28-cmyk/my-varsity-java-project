import java.util.Scanner;
public class PrimeNumber {   
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number: ");
        int num = scanner.nextInt();
        int count = 0;

        for (int i = 2; i < num; i ++ ) {
            if(num %i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }
        scanner.close();
    }
    
}
