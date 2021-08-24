import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class question4test {
	
	question4 j;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Starting up....");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tearing down....");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initializing....");
		j= new question4();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Cleaning up....");
		j=null;
	}

	@Test
	void test1() {
		assertEquals("HELLO", j.getCaps("Hello"));
	}
	
	@Test
	void test2() {
		assertEquals("TESTING", j.getCaps("testing"));
	}

}