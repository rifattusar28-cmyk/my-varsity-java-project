import java.util.Scanner; 
public class LargestNumber {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int num1, num2,num3, large;

        System.out.println("Enter three number: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        large = (num1 > num2) ? (num1 > num3 ? num1 : num3 ): (num2 > num3 ? num2 : num3 );
        
        System.out.println("largest among 3 numbers: " + large );

        scanner.close();


    }
     
}
