

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {

        if(root == null){
            return true;
        }

        
        return helper(root, root.val);
    }

    public boolean helper(TreeNode node, int target){

        if(node == null){
            return true;
        }

        if(node.val != target){
            return false;
        }

        return helper(node.left, target) && helper(node.right, target);
    }


}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        helper(root1, leaves1);
        helper(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    public void helper(TreeNode root, List<Integer> leaves){

        if(root == null){
            return;
        }

        if (root.left == null && root.right == null) {
            leaves.add(root.val);
            return;
        }

        helper(root.left, leaves);
        helper(root.right, leaves);

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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;

        }

        head.next = removeElements(head.next, val);

        return head.val == val ? head.next : head;
    }
}


