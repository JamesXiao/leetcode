package xiao.yang.leetcode.no1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Xiao Yang on 2018/10/08.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testTwoSum(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        Assert.assertEquals(2, result.length);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }
}
