package home_tasks.factorial;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialTest {

    private int input;
    private int expected;
    private Factorial factorial;

    public FactorialTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 1},
            {1, 1},
            {3, 6},
            {4, 24},
            {5, 120},
            {8, 40320}
        });
    }

    @Test
    public void shouldReturnExpectedWhenInputRecursive() {
        assertEquals(expected, factorial.factRecursive(input));
    }

    @Test
    public void shouldReturnExpectedWhenInputUsual() {
        assertEquals(expected, factorial.fact(input));
    }
}