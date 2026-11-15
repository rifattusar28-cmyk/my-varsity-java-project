import java.util.*;
public class GCD {
    // Java program to compute GCD
// of two numbers using Euclid's
// repeated subtraction approach
    // gcd method returns the GCD of a and b
    static int gcd(int a, int b)
    {
        // if b=0, a is the GCD
        if (b == 0)
            return a;

        // call the gcd() method recursively by
        // replacing a with b and b with
        // difference(a,b) as long as b != 0
        else
            return gcd(b, Math.abs(a - b));
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 30, b = 20;

        // calling gcd() over
        // integers 30 and 20
        System.out.println("GCD = " + gcd(a, b));
    }
}
    

