/*
# Complexity

Time: O(m * n)
Space: O(m * n)
*/

public class TransposeMatrix {

    public int[][] transpose(int[][] arr){

        int m = arr.length;
        int n = arr[0].length;

        int[][] result = new int[n][m];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[j][i] = arr[i][j];
            }
        }

        return result;
    }
}