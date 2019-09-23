package task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeSignTest {

    private ChangeSign instance;

    @Before
    public void setUp() throws Exception {
        instance = new ChangeSign();
    }

    @Test
    public void shoutReturnPositiveWithNegativeSign() {
        int result = instance.changeSign(10);
        assertEquals(-10,result);
    }
    @Test
    public void shoutReturnNegativeWithPositiveSign() {
        int result = instance.changeSign(-10);
        assertEquals(10,result);
    }
    @Test
    public void shoutReturnZeroWithZero() {
        int result = instance.changeSign(0);
        assertEquals(0,result);

    }
}