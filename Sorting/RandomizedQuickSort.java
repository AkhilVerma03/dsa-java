import java.util.Random;

public class RandomizedQuickSort {
    private static final Random RANDOM = new Random();

    public int[] sortArray(int[] nums) {
        int p = 0;
        int r = nums.length-1;
        return quickSort(nums,p,r);
    }
    
     public int partition(int[] arr, int p, int r) {

        int randomPivotIndex = p + RANDOM.nextInt(r - p + 1);
        int temp = arr[randomPivotIndex];
        arr[randomPivotIndex] = arr[r];
        arr[r] = temp;

        int pivot = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                i++;
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
        }
        int k = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = k;
        return i + 1;
    }

    public int[] quickSort(int[] nums,int p , int r){
        if(p<r){
            int q = partition(nums,p,r);
            quickSort(nums,p,q-1);
            quickSort(nums,q+1,r);
        }
        return nums;
    }

    
}
