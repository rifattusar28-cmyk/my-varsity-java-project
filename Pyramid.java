import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num ;
    
            System.out.print("Enter how many line: ");
        num = scanner.nextInt();

        for(int row = 1; row <= num; row++ ){
        for(int col = num - row; col>= 1; col-- ){
            System.out.print(" ");
            }
        for(int k = 1; k<= row; k++){
            System.out.print(" *");
        }
            System.out.println("");
        }
        scanner.close();
    }  
}
