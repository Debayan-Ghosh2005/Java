public class Array_copy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        // Copy elements
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        System.out.print("Array = {");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i]);
            if (i < originalArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        System.out.print("Copy Array Elements one to Another Array = {");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i]);
            if (i < copiedArray.length - 1) System.out.print(", ");
        }
        System.out.println("}");
    }}
