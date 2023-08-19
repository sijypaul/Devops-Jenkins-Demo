package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JunitTest test = new JunitTest();
		int output = test.square(10);
		assertEquals(100,output);
	}

}
