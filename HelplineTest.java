package JunitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelplineTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		Helpline h =new Helpline();
		monkey result=new monkey();
		new connect().test(result);
	}

	@Test
	void test() {
		Helpline h =new Helpline();
		monkey result=new monkey();
		new connect().test(result);
	assertEquals("ill take care of monkey", "ill take care of monkey");
	}

}
