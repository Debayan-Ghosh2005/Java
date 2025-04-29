import java.util.Scanner;
// Program to reverse an array
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Array Size = ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Element of a[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Display Reverse Order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }    }}
