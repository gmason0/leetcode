package io.github.gmason0.twonumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest
{

	@Test
	void testExampleOne()
	{
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

		ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		int[] expectedValues = {7, 0, 8};
		ListNode current = result;
		for (int val : expectedValues)
		{
			assertNotNull(current);
			assertEquals(val, current.val);
			current = current.next;
		}
	}

	@Test
	void testExampleTwo()
	{
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);

		ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		int[] expectedValues = {0};
		ListNode current = result;
		for (int val : expectedValues)
		{
			assertNotNull(current);
			assertEquals(val, current.val);
			current = current.next;
		}
	}

	@Test
	void testExampleThree()
	{
		ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

		ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		int[] expectedValues = {8, 9, 9, 9, 0, 0, 0, 1};
		ListNode current = result;
		for (int val : expectedValues)
		{
			assertNotNull(current);
			assertEquals(val, current.val);
			current = current.next;
		}
	}
}
