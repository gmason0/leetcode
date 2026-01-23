package io.github.gmason0.rmdup;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest
{

	@Test
	void testExampleOne()
	{
		int[] input = {1, 1, 2};
		int expectedLength = 2;
		int[] expectedArray = {1, 2};

		int k = RemoveDuplicates.removeDuplicates(input);

		assertEquals(expectedLength, k);
		for (int i = 0; i < k; i++)
		{
			assertEquals(expectedArray[i], input[i]);
		}
	}

	@Test
	void testExampleTwo()
	{
		int[] input = {0,0,1,1,1,2,2,3,3,4};
		int expectedLength = 5;
		int[] expectedArray = {0,1,2,3,4};

		int k = RemoveDuplicates.removeDuplicates(input);

		assertEquals(expectedLength, k);
		for (int i = 0; i < k; i++)
		{
			assertEquals(expectedArray[i], input[i]);
		}
	}
}
