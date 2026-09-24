/*
# Complexity

Time: O(n * d)
Space: O(1)
*/

class SmallestIndexWithDigitSum {

    public int sumDigits(int n){
        int sum = 0;

        while(n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i == sumDigits(nums[i])){
                return i;
            }
        }

        return -1;
    }
}