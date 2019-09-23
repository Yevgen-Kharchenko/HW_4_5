package task2;

import org.junit.Before;
import org.junit.Test;

public class ChangeSignTest {

    private ChangeSign instance;

    @Before
    public void setUp() throws Exception {
        instance = new ChangeSign();
    }

    @Test
    public void shoutReturnPositiveWithNegativeSign() {
        int result = instance.changeSign(10);
        assert result == -10;
    }
    @Test
    public void shoutReturnNegativeWithPositiveSign() {
        int result = instance.changeSign(-10);
        assert result == 10;
    }
    @Test
    public void shoutReturnZeroWithZero() {
        int result = instance.changeSign(0);
        assert result == 0;

    }
}