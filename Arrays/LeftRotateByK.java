class leftrotatebyk {
    public static void reverse(int start, int end , int arr[]) {
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public void rotate(int arr[] , int k){
        k = k % arr.length;
        reverse(0 , k-1 , arr);
        reverse(k , arr.length-1 , arr);
        reverse(0 , arr.length-1 , arr);
    }
        
    }
