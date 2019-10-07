package Babysitter_kata.Babysitter_kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class BabysitterTest {
	
	Babysitter testBabysitter = new Babysitter();

	@Test
	public void test_that_Babysitter_is_an_object() {
		assertNotNull(testBabysitter);
	}

}
