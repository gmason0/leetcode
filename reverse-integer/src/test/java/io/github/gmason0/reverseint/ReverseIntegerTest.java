package io.github.gmason0.reverseint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest
{
	@Test
	void testExampleOne()
	{
		int input = 123;

		assertEquals(321, ReverseInteger.reverse(input));
	}

	@Test
	void testExampleTwo()
	{
		int input = -123;

		assertEquals(-321, ReverseInteger.reverse(input));
	}

	@Test
	void testExampleThree()
	{
		int input = 120;

		assertEquals(21, ReverseInteger.reverse(input));
	}
}
