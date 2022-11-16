package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("Harsh", "Choudhary");
		assertEquals ("HarshChoudhary", result);
	}

}
