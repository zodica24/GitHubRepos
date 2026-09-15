
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode forword = head;
        ListNode backword = head;
        ListNode point = null;
        ListNode prev = null;
        boolean swicth = true;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        backword = slow;

        while(backword != null){

            point = backword.next;
            backword.next = prev;
            prev = backword;
            backword = point;
        }
        backword = prev;


        while(backword != null){
            if(backword.val != forword.val){
                swicth = false;
                
            }
            forword = forword.next;
            backword = backword.next;
        }
        return swicth;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode secound = list2;
        ListNode newList = new ListNode();
        ListNode merg = newList;

        while(secound != null && first != null){

            if(first.val <= secound.val){
                merg.next = first;
                first = first.next;
                
            }
            else{
                merg.next = secound;
                secound = secound.next;
                
            }
            merg = merg.next;
            
            
        }

        if(secound != null){
            merg.next = secound;
        }
        else if(first != null){
            merg.next = first;
        }


        return newList.next;
    }
}

// we did this one in class this is the code i did along side you
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode point = null;
        ListNode cur = head;

        while(cur != null){

            point = cur.next;
            cur.next = prev;
            prev = cur;
            cur = point;
        }

        return prev;



    }
}

