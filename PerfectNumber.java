import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num ,sum = 0,r,fact,temp,i;

        System.out.println("Enter any positive number: ");
        num = scanner.nextInt();
        temp = num;
        while(temp != 0){
            r = temp %10 ;
            fact = 1;
            for(i = 1; i<num; i++){
                if(num % i == 0)
            sum = sum + i;
        temp = temp / 10;
    
            }
            
        }

        if(num == sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not Perfect number");
        }
    scanner.close();
    }
    
}
