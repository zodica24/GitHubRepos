
class Solution {

    private int min = Integer.MAX_VALUE;

    private Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;

    }

    private void helper(TreeNode root){

        if(root == null){
            return;
        }

        helper(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }

        prev = root.val;

        helper(root.left);

    }
}

class Solution {

    private TreeNode match;
    public TreeNode searchBST(TreeNode root, int val) {
        helper(root, val);
        return match;
    }

    public void helper(TreeNode root, int val){

        if (root == null){
            return;
        }

        helper(root.left, val);
        
        if(root.val == val){
            match = root;
            return;
        }
        
        helper(root.right, val);
    }
}

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int gift : gifts) {
            pq.offer(gift);
        }
        
        while (k > 0) {
            int maxPile = pq.poll();
            int reducedPile = (int) Math.sqrt(maxPile);
            pq.offer(reducedPile);
            k--;
        }
        
        long totalGifts = 0;
        while (!pq.isEmpty()) {
            totalGifts += pq.poll();
        }
        
        return totalGifts;
    }
}
