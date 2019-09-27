package task5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ChangePosTest {

    @Spy
    @InjectMocks
    ChangePos changePos;

    @Mock
    Utils utils;

    @Before
    public void init() {
        Mockito.when(utils.changePosition(2, 2)).thenReturn(6);
    }

    @Test
    public void converting() {
        int result = changePos.converting(2, 2);
        assertEquals(6, result);
    }
}