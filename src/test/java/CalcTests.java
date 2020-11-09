import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTests {

    public Calculator calc;

    @BeforeEach
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void addTest(){
        double actual = calc.add(13D, 27D);
        double expected =40D;
        assertEquals(actual, expected);
    }

    @Test
    public void subtractTest(){
        double actual = calc.subtract(131D, 45D);
        double expected =86D;
        assertEquals(actual, expected);
    }

    @Test
    public void multiplyTest(){
        double actual = calc.multiply(10D, 11D);
        double expected =110D;
        assertEquals(actual, expected);
    }

    @Test
    public void divideTest(){
        double actual = calc.divide(10000D, 3D);
        double expected =3333.3333333333335D;
        assertEquals(actual, expected);
    }

    @Test
    public void modTest(){
        double actual = calc.mod(25D, 3D);
        double expected = 1D;
        assertEquals(actual, expected);
    }

    @Test
    public void exponentTest(){
        double actual = calc.exponent(45D, 11D);
        double expected = 1532278301220703125D;
        assertEquals(actual, expected);
    }

    @Test
    public void squareRootTest(){
        double actual = calc.squareRoot(100D);
        double expected = 10D;
        assertEquals(actual, expected);
    }
}
