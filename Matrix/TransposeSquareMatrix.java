/*
# Complexity

Time: O(n²)
Space: O(1)
*/

public class TransposeSquareMatrix {

    public void transpose(int[][] arr){

        for(int i=0;i<arr.length-1;i++){

            for(int j=i+1;j<arr[i].length;j++){

                int temp = arr[i][j];

                arr[i][j] = arr[j][i];

                arr[j][i] = temp;
            }
        }
    }
}