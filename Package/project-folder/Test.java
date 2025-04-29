import first.Factorial;
import second.GCD;
public class Test {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        GCD g = new GCD();
        int fact = f.findFactorial(5);
        int gcd = g.findGCD(24, 18);
        System.out.println("Factorial of 5: " + fact);
        System.out.println("GCD of 24 and 18: " + gcd);
    }}
