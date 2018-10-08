package xiao.yang.leetcode.no2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Xiao Yang on 2018/10/08.
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testAddTwoNumbers(){
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(list1, list2);
        Assert.assertEquals(7, result.val);
        Assert.assertEquals(0, result.next.val);
        Assert.assertEquals(8, result.next.next.val);
        Assert.assertNull(result.next.next.next);
    }
}
