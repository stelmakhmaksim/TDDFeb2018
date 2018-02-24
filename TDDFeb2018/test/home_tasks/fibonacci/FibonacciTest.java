package home_tasks.fibonacci;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {

    private int input;
    private int expected;
    private Fibonacci fibonacci = new Fibonacci();

    public FibonacciTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 0},
            {1, 1},
            {2, 1},
            {3, 2},
            {4, 3},
            {7, 13},
            {10, 55},
            {12, 144},
            {15, 610},
            {20, 6765}
        });
    }

    @Test
    public void shouldReturnExpectedWhenInputRecursive() {
        assertEquals(expected, fibonacci.fibRecursive(input));
    }

    @Test
    public void shouldReturnExpectedWhenInputUsual() {
        assertEquals(expected, fibonacci.fib(input));
    }


}