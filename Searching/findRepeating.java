
public class findRepeating {

    //Elements are strictly in the range [0, n-1]
    //We ARE allowed to modify the original array
    //Requirement: O(n) Time, O(1) Space
    public int findRepeatingModulo(int nums[]){
        int n = nums.length;
        for(int i=0;i<n;i++){
            int index = nums[i]%n;
            nums[index] = nums[index] + n ;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=2*n){
                return i;
            }
        }
        return -1;
    }

    //Elements are strictly in the range [1, n]
    //We ARE NOT allowed to modify the original array
    //Requirement: O(n) Time, O(1) Space
    //Tortoise and Hare method
    public int findRepeatingFloyd(int nums[]){
        int slow = nums[0];
        int fast = nums[0];
        do { 
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);

        slow = nums[0];
         while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
         }

        return slow;
    }
    
}
