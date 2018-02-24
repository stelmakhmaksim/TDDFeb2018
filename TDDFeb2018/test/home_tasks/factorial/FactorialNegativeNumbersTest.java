package home_tasks.factorial;

import org.junit.Test;

public class FactorialNegativeNumbersTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNegative() {
        Factorial factorial = new Factorial();

        factorial.factRecursive(-21);
        factorial.fact(-21);
    }


}
