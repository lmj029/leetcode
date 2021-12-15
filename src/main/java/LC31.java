public class LC31 {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;

        int i = nums.length - 2;
        while(nums[i] >= nums[i+1]) {
            i--;
        }

        if(i>=0) {
            for(int j = nums.length - 1; j>i; j--) {
                if(nums[j] > nums[i]) {
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                    break;
                }
            }
        }

        reverse(nums, i+1, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
