class Hexadec_binary {
    public static void main(String args[]) {
        int n = 15;
        String s = "";
        while (n > 0) {
            int r = n % 16;
            if (r >= 10) {
                // Convert to hexadecimal character
                s = (char) ('A' + (r - 10)) + s; // 'A' corresponds to 10
            } else {
                s = r + s; // Concatenate the integer as a string
            }
            n = n / 16;
        }
        System.out.println("HexaDecimal: " + s);
    }
}