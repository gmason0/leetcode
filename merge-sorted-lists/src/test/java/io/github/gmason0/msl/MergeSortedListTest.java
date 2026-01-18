package io.github.gmason0.msl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class MergeSortedListTest
{
	@Test
	void testExampleOne()
	{
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

		ListNode merged = MergeSortedList.mergeTwoLists(list1, list2);

		int[] expectedValues = {1, 1, 2, 3, 4, 4};
		ListNode current = merged;
		for (int val : expectedValues)
		{
			assertNotNull(current);
			assertEquals(val,current.val);
			current = current.next;
		}
		assertNull(current);
	}

	@Test
	void testExampleTwo()
	{
		ListNode list1 = null;
		ListNode list2 = null;

		ListNode merged = MergeSortedList.mergeTwoLists(list1, list2);

		assertNull(merged);
	}

	@Test
	void testExampleThree()
	{
		ListNode list1 = null;
		ListNode list2 = new ListNode(0);

		ListNode merged = MergeSortedList.mergeTwoLists(list1, list2);

		assertNotNull(merged);
		assertEquals(0, merged.val);
		assertNull(merged.next);
	}
}
