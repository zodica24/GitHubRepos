
class Solution {
    public String removeOuterParentheses(String s) {
        
        int current = 0;
        List<Character> fin = new ArrayList<>();
        
        for(char c : s.toCharArray()){
            
            if(c == '('){
                
                if(current > 0){
                    fin.add(c);
                }
               current++; 
            }
            else if(c == ')'){
                current--;
                if(current > 0){
                    fin.add(c);
                }
                
            }
            
            
        }

        
        StringBuilder sb = new StringBuilder();
        for (Character t : fin) {
            sb.append(t);
        }
        String result = sb.toString();

        return result;
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
    public int getDecimalValue(ListNode head) {
        
        ListNode dm = head;
        int finalNum = 0;

        
        return helper(finalNum, dm);
    }

    public int helper(int num, ListNode dm){

        if(dm == null){
            return num;
        }

        num = num * 2 + dm.val;
        dm = dm.next;

        return helper(num, dm);  
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
    public boolean checkTree(TreeNode root) {
        
        

        if (root == null || root.left == null || root.right == null){
            return false;
        }

        return root.val == ( root.left.val + root.right.val);
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
    public boolean evaluateTree(TreeNode root) {
        
        if(root.val == 0){
            return false;
        }
        if (root.val == 1){
            return true;
        }

        return helper(root);


    }


    public boolean helper(TreeNode root){

        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);

        if (root.val == 2) {
            return leftVal || rightVal;
        } else if (root.val == 3) {
            return leftVal && rightVal;
        }

        return false;

    }
}
