package task5;

public class ChangePos {

    private Utils utils;

    public ChangePos() {
        this.utils = new UtilsImpl();
    }

    int converting(int num, int pos) {
        return utils.changePosition(pos, num);
    }

    public static void main(String[] args) {
        int num = 456;
        int pos = 4;
        System.out.println("Your number is " + num + " chang " + pos + " position");
        System.out.println("Your number on binary is:    " + Integer.toBinaryString(num));
        ChangePos changePos = new ChangePos();
        int newNum = changePos.converting(num,pos);
        System.out.println("Changed number on binary is: " + Integer.toBinaryString(newNum));


    }


}
