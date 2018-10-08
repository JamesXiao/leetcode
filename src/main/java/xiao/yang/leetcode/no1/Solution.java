package xiao.yang.leetcode.no1;

import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> m = new HashMap<>(); // number and its index
        for(int i=0;i<numbers.length;i++){
            if(m.containsKey(target-numbers[i])){
                result[0]=m.get(target-numbers[i]);
                result[1]=i;
                break;
            }
            m.put(numbers[i], i);
        }
        return result;
    }

}