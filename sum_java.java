// Class to demonstrate method overloading
public class sum_java {
    // Method to add two integers
    static int sum(int a, int b) {
        return a + b;
    }

    // Method to add two floating-point numbers
    static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Adding integers
        int intSum = sum(5, 10);
        System.out.println("Sum of integers: " + intSum);

        // Adding floating-point numbers
        double doubleSum = sum(3.5, 2.7);
        System.out.println("Sum of floating-point numbers: " + doubleSum);
    }
}
