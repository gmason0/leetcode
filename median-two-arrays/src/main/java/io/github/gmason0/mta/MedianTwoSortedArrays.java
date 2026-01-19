package io.github.gmason0.mta;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianTwoSortedArrays
{
	static double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int[] combined = combine(nums1, nums2);
		int len = combined.length;

		if (len % 2 == 0)
		{
			return (combined[len / 2 - 1] + combined[len / 2]) / 2.0;
		}
		else
		{
			return combined[len / 2];
		}
	}

	static int[] combine(int[] nums1, int nums2[])
	{
		return IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
			.sorted()
			.toArray();
	}
}
