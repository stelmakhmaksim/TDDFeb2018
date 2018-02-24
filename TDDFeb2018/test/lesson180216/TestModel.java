package lesson180216;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestModel {

	@Test
	public void test() {
		Model model = new Model();
		model.change();
		assertEquals(model.state, 1);
	}

}
