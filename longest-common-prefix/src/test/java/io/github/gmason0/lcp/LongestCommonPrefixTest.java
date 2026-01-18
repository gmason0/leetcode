package io.github.gmason0.lcp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest
{
	@Test
	void testExampleOne()
	{
		String[] input = {"flower","flow","flight"};

		assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(input));
	}

	@Test
	void testExampleTwo()
	{
		String[] input = {"dog", "racecar", "car"};
		assertEquals("", LongestCommonPrefix.longestCommonPrefix(input));
	}
}
