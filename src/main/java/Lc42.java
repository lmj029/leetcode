public class Lc42 {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        maxLeft[0] = height[0];
        for(int i = 1; i< height.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }
        int[] maxRight = new int[height.length];
        maxRight[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        int ans = 0;
        for(int i=1; i<= height.length -2; i++) {
            int tmpHeight = Math.min(maxLeft[i], maxRight[i]);
            if(tmpHeight - height[i] > 0) {
                ans += tmpHeight - height[i];
            }
        }

        return ans;

    }
}
