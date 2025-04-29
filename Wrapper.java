public class Wrapper {
    public static void main(String[] args) {
        // Primitive to Wrapper (Autoboxing)
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("Primitive to Wrapper: " + wrapperInt);

        // Wrapper to Primitive (Unboxing)
        Double wrapperDouble = 20.5;
        double primitiveDouble = wrapperDouble; // Unboxing
        System.out.println("Wrapper to Primitive: " + primitiveDouble);
    }
}
