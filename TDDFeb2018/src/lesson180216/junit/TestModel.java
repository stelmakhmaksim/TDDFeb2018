package lesson180216.junit;

import static lesson180216.TestFramework.assertEquals;

import lesson180216.Model;
import org.junit.jupiter.api.Test;

public class TestModel {

    @Test
    public void test() {
        Model model = new Model();
        model.change();
        assertEquals(model.state, 1);
    }

}
