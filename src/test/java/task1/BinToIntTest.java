package task1;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class BinToIntTest {

    private BinToInt instance;

    @Before
    public void setUp() {
        instance = new BinToInt();
    }

    @Test(expected = IOException.class)
    public void binaryToIntShouldExceptionIfInputNotBinary() throws IOException {
        instance.binaryToInt("123");
    }

    @Test
    public void binaryToIntShouldReturnIntIInputBinary() throws IOException {
        assertEquals(53, instance.binaryToInt("110101"));
    }
    @Test
    public void binaryToIntShouldReturnZeroIInputZero() throws IOException {
        assertEquals(0, instance.binaryToInt("0"));
    }
}