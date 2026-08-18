class majority_element {
        public int majorityElement(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } 
            else if (count == 0) {
                candidate = arr[i];
                count = 1;
            } 
            else {
                count--;
            }
        }

        return candidate;
    }
}