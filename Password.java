import java.util.Scanner;
public class Password {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "NahidSir1234"; 
        String userPassword;
        
        do {
            System.out.print("Enter your password: ");
            userPassword = scanner.nextLine();

            
            if (!userPassword.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }

        } while (!userPassword.equals(correctPassword));

        System.out.println("Access Granted! Welcome.");
        scanner.close();
    }
}
    

