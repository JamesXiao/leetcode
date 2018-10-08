package xiao.yang.leetcode.no2;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode dummHead=new ListNode(0);
        ListNode pointer=dummHead;
        int plusOne=0;
        if(list1==null && list2 ==null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }else{
            while(list1!=null || list2!=null){
                int val1=0;
                int val2=0;
                if(list1!=null){
                    val1=list1.val;
                    list1=list1.next;
                }
                if(list2!=null){
                    val2 = list2.val;
                    list2=list2.next;
                }
                int val = val1+val2+plusOne;
                if(val>9){
                    val=val-10;
                    plusOne=1;
                }else{
                    plusOne=0;
                }
                pointer.next = new ListNode(val);

                pointer = pointer.next;
            }
            if(plusOne==1){
                pointer.next = new ListNode(1);
            }
        }
        return dummHead.next;
    }

    /**
     * 有int型溢出的问题
     * @param list1
     * @param list2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode list1, ListNode list2) {
        if(list1==null && list2 ==null){
            return null;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }else{
            int number1 = listToInt(list1);
            int number2 = listToInt(list2);
            return intToList(number1 + number2);
        }
    }

    private int listToInt(ListNode list){
        ListNode pointer = list;
        int number = 0;
        int pow = 0;
        while(pointer!=null){
            number += pointer.val * Math.pow(10, pow);
            pow++;
            pointer = pointer.next;
        }
        return number;
    }

    private ListNode intToList(int number){
        ListNode dumHeader = new ListNode(0);
        ListNode pointer = dumHeader;
        do {
            pointer.next = new ListNode(number % 10);
            pointer = pointer.next;
            number = number / 10;
        } while(number > 0);
        return dumHeader.next;
    }
}