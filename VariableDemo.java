class Box {
    
    int length = 10; 

    void calculateArea() {
        
        int width = 5; 
        
        int area = length * width; 
        System.out.println("Area: " + area);
    }
}
public class VariableDemo {
    public static void main(String[] args) {
        Box b1 = new Box(); 
        b1.calculateArea(); 
    }
}
