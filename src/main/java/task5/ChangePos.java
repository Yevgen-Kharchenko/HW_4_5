package task5;

public class ChangePos {
    public static void main(String[] args) {
        int num = 543;
        int pos = 4;
        int newNum;
        System.out.println("Your number is " + num + " chang " + pos + " position");
        System.out.println("Your number on binary is:    " + Integer.toBinaryString(num));
        newNum = changPosition(pos, num);
        System.out.println("Changed number on binary is: " + Integer.toBinaryString(newNum));


    }

    private static int changPosition(int position, int value) {
        return value ^ 1 << position;
    }
}
