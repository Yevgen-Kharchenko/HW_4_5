package task2;

public class ChangeSign {
    public static void main(String[] args) {
        ChangeSign cs = new ChangeSign();
        int num = 456;
        System.out.println(cs.changeSign(num));
    }

    public int changeSign(int value) {
        value = ~value + 1;
        return value;
    }
}

