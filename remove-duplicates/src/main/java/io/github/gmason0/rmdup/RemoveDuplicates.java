package io.github.gmason0.rmdup;

import java.util.Arrays;

public class RemoveDuplicates
{
	static int removeDuplicates(int[] nums)
	{
		if (nums.length == 0)
		{
			return 0;
		}

		int[] distinct = Arrays.stream(nums)
			.distinct()
			.toArray();

		System.arraycopy(distinct, 0, nums, 0, distinct.length);

		return distinct.length;
	}
}
