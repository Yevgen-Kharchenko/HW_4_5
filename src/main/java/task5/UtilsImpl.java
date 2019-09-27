package task5;

public class UtilsImpl implements Utils{
    @Override
    public int changePosition(int position, int value) {
        return value ^ 1 << position;
    }
}
