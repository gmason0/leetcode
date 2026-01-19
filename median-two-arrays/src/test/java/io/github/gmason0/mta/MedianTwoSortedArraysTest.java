package io.github.gmason0.mta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedianTwoSortedArraysTest
{

	@Test
	void testExampleOne()
	{
		int[] nums1 = {1, 3};
		int[] nums2 = {2};

		assertEquals(2.0, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
	}

	@Test
	void testExampleTwo()
	{
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};

		assertEquals(2.5, MedianTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
	}
}
