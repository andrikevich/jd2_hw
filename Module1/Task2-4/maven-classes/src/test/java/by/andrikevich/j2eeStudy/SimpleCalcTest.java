package by.andrikevich.j2eeStudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class SimpleCalcTest
{



    @Test
    public void sumDiffNumbers()
    {
        SimpleCalc calc = mock(SimpleCalc.class);
        when(calc.sum(3,5)).thenReturn(8);
        int result = calc.sum(3,5);
        assertEquals(8,result);
    }
        @Test
    public void minusDiffNumbers (){
        SimpleCalc calc = mock(SimpleCalc.class);
        when(calc.minus(3,5)).thenReturn(-2);
        int result = calc.minus(3,5);
        assertEquals(-2,result);
    }
}
