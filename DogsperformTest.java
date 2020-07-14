package JunitTestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogsperformTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		new barking().call();
		assertEquals("barking dog....","barking dog....");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		  habit t =new Eating();
			t.call();
			new barking().call();
			assertEquals(" dog eating...."," dog eating....");
			assertEquals("barking dog....","barking dog....");
	}

}
