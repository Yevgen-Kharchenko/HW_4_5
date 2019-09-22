import java.io.IOException;

public class BinToInt {
    public static void main(String[] args) {

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
        System.out.println(binaryToInt(s));
    }


    static int binaryToInt(String binary) {
        char[] cA = binary.toCharArray();
        int result = 0;
        for (int i = cA.length - 1; i>= 0; i--) {
            if (cA[i] == '1') result += Math.pow(2, cA.length - i - 1);
        }
        return result;
    }
}
