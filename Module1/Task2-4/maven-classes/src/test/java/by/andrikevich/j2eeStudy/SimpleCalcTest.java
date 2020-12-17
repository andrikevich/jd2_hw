package by.andrikevich.j2eeStudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SimpleCalcTest
{
@Mock
    SimpleCalc calc;

    @Test
    public void sumDiffNumbers()
    {
        when(calc.sum(3,5)).thenReturn(8);
        int result = calc.sum(3,5);
        assertEquals(8,result);
    }
        @Test
    public void minusDiffNumbers (){
        when(calc.minus(3,5)).thenReturn(-2);
        int result = calc.minus(3,5);
        assertEquals(-2,result);
    }
}
