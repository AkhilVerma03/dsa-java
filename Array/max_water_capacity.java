public class max_water_capacity {
    public int maxArea(int[] height) {
        int max_capacity = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            max_capacity = Math.max(
                    max_capacity,
                    Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return max_capacity;
    }
}
