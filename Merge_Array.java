// Program to merge two arrays into a third array
public class Merge_Array {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        // Copy elements of firstArray to mergedArray
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }

        // Copy elements of secondArray to mergedArray
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[firstArray.length + i] = secondArray[i];
        }
        System.out.print("First Array = {");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        System.out.print("Second Array = {");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");

        // Display merged array
        System.out.print("Merge two Array Elements = {");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]);
            if (i < mergedArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }
}
