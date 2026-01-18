package io.github.gmason0.lssnp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestSubstringNonRepeatingTest
{

	@Test
	void testExampleOne()
	{
		String input = "abcabcbb";

		assertEquals(3, LongestSubstringNonRepeating.lengthOfLongestSubstring(input));
	}

	@Test
	void testExampleTwo()
	{
		String input = "bbbbb";

		assertEquals(1, LongestSubstringNonRepeating.lengthOfLongestSubstring(input));
	}

	@Test
	void testExampleThree()
	{
		String input = "pwwkew";

		assertEquals(3, LongestSubstringNonRepeating.lengthOfLongestSubstring(input));
	}
}
