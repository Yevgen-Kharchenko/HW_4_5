package task3;

public class HowManyBit {
    public static void main(String[] args) {
        byte byteType = 1;
        int counterByte = 0;
        while (byteType != 0) {
            byteType <<= 1;
            counterByte++;
        }
        System.out.println("The byte contains " + counterByte + " bits");

        short shortType = 1;
        int counterShort = 0;
        while (shortType != 0) {
            shortType <<= 1;
            counterShort++;
        }
        System.out.println("The short contains " + counterShort + " bits");

        int intType = 1;
        int counterInt = 0;
        while (intType != 0) {
            intType <<= 1;
            counterInt++;
        }
        System.out.println("The int contains " + counterInt + " bits");

        long longType = 1;
        int counterLong = 0;
        while (longType != 0) {
            longType <<= 1;
            counterLong++;
        }
        System.out.println("The long contains " + counterLong + " bits");

    }
}
