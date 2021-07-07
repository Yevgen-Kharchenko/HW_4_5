package task1;

import java.io.IOException;

public class BinToInt {
    public static void main(String[] args) throws IOException {
        System.out.println(binaryToInt(reader()));
    }

    public static String reader() {
        int inChar;
        String s = "";
        try {
            inChar = System.in.read();
            while (System.in.available() > 0) {
                s += (char) inChar;
                inChar = System.in.read();
            }
        } catch (
                IOException e) {
            System.out.println("Error");
        }
        return s;
    }

    static int binaryToInt(String binary) throws IOException {
        char[] cA = binary.toCharArray();
        int result = 0;
        for (int i = cA.length - 1; i >= 0; i--) {
            if (cA[i] == '1') result += Math.pow(2, cA.length - i - 1);
            else {
                if (cA[i] != '0') {
                    throw new IOException("Error input");
                }
            }
        }
        return result;
    }
}
