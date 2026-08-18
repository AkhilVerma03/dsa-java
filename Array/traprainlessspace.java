public class traprainlessspace {

    // O(1) space complexity
    public int trap_2(int[] height) {

        int i = 1;
        int j = height.length - 2;

        int left_max = height[0];
        int right_max = height[height.length - 1];

        int water = 0;

        while (i <= j) {

            if (left_max <= right_max) {

                if (height[i] > left_max) {
                    left_max = height[i];
                } else {
                    water += left_max - height[i];
                }

                i++;

            } else {

                if (height[j] > right_max) {
                    right_max = height[j];
                } else {
                    water += right_max - height[j];
                }

                j--;
            }
        }

        return water;
    }
}