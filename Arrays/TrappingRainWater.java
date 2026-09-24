public class traprainwater {
    // O(n) - space complexity

    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];

        leftmax[0] = height[0];
        rightmax[height.length - 1] = height[height.length - 1];

        int left_max = leftmax[0];
        int right_max = rightmax[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            left_max = Math.max(left_max, height[i]);
            leftmax[i] = left_max;
        }

        for (int j = height.length - 2; j >= 0; j--) {
            right_max = Math.max(right_max, height[j]);
            rightmax[j] = right_max;
        }

        int water = 0;

        for (int k = 0; k < height.length; k++) {
            water += Math.min(leftmax[k], rightmax[k]) - height[k];
        }

        return water;

    }

}
