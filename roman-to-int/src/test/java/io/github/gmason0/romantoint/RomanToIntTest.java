package io.github.gmason0.romantoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanToIntTest
{

	@Test
	void testExampleOne()
	{
		String input = "III";

		assertEquals(3, RomanToInt.romanToInt(input));
	}

	@Test
	void testExampleTwo()
	{
		String input = "LVIII";

		assertEquals(58, RomanToInt.romanToInt(input));
	}

	@Test
	void testExampleThree()
	{
		String input = "MCMXCIV";

		assertEquals(1994, RomanToInt.romanToInt(input));
	}
}
