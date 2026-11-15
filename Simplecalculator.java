import java.util.Scanner;
public class Simplecalculator {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
      double num1, num2,ans;
      char op;

      System.out.print("Enter two numbers: ");
      num1 = scanner.nextDouble();
      num2 = scanner.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
      op = scanner.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("The result is: ");
      System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
      scanner.close();
   }
}     
