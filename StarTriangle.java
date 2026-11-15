import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num ;
        
        System.out.print("Enter how many line: ");
        num = scanner.nextInt();

        for(int row = 1;  row <= num; row++){
            for(int col = 1;  col <= row; col++ ){
        System.out.print(" *" );
        }
        System.out.println("");
    }
    scanner.close();
    }

    
}
