package io.github.gmason0.twosums;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class TwoSumsTest
{
	@Test
	void testExampleOne()
	{
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = TwoSums.twoSum(nums, target);

		assertArrayEquals(new int[]{0, 1}, result);
	}

	@Test
	void testExampleTwo()
	{
		int[] nums = {3, 2, 4};
		int target = 6;
		int[] result = TwoSums.twoSum(nums, target);

		assertArrayEquals(new int[]{1, 2}, result);
	}

	@Test
	void testExampleThree()
	{
		int[] nums = {3, 3};
		int target = 6;
		int[] result = TwoSums.twoSum(nums, target);

		assertArrayEquals(new int[]{0, 1}, result);
	}

	@Test
	void testNoSolution()
	{
		int[] nums = {1, 2, 3};
		int target = 10;

		assertThrows(IllegalArgumentException.class, () -> TwoSums.twoSum(nums, target));
	}
}
