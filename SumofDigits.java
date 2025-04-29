public class SumofDigits {
    
    static int sumOfDigits(int number) {
        if (number == 0) {
            return 0; 
        }
        return (number % 10) + sumOfDigits(number / 10); 
    }

    public static void main(String[] args) {
        int number = 12345; 
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits(number));
    }
}
