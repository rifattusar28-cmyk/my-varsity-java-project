import java.util.Scanner;
public class StrongNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num ,sum = 0 ,temp,r, fact,i ;

        System.out.print("Enter any number:  ");
        num = scanner.nextInt();

        temp = num;
        while(temp != 0){
            r = temp % 10;
        fact = 1;
        for(i = 1; i <= r; i++) {
            fact = fact * i;
        }
            sum = sum + fact;
            temp = temp/10;
        }
        
        if(num == sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
        scanner.close();
    }
    
}
