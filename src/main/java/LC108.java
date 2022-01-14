public class LC108 {
        public TreeNode sortedArrayToBST(int[] nums) {
                return BSTHelper(nums, 0, nums.length - 1);
        }

        public TreeNode BSTHelper(int[] nums, int left, int right) {
                if(left > right) return null;

                int mid = left + (right - left)/2;

                TreeNode root = new TreeNode(nums[mid]);

                root.left = BSTHelper(nums, left, mid - 1);
                root.right = BSTHelper(nums, mid+1, right);
                return root;
        }
}
