class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return treeBuilder(nums, 0, nums.length);
    }
    
    private TreeNode treeBuilder(int[] nums, int start, int end) {
        if(start == end) return null;
        
        int max = nums[start];
        int maxIndex = start;
        
        for(int i = start; i < end; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        TreeNode root = new TreeNode(max);
        root.left = treeBuilder(nums, start, maxIndex);
        root.right = treeBuilder(nums, maxIndex + 1, end);
        
        return root;
    }
}
