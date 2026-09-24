/*
# Complexity

Time: O(m * n)
Space: O(1)
*/

public class BoundaryTraversal {

    public void print(int[][] arr){

        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            for(int j=0;j<cols;j++){
                System.out.print(arr[0][j]+" ");
            }
            return;
        }

        if(cols == 1){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][0]+" ");
            }
            return;
        }

        for(int j=0;j<cols;j++){
            System.out.print(arr[0][j]+" ");
        }

        for(int i=1;i<rows;i++){
            System.out.print(arr[i][cols-1]+" ");
        }

        for(int j=cols-2;j>=0;j--){
            System.out.print(arr[rows-1][j]+" ");
        }

        for(int i=rows-2;i>0;i--){
            System.out.print(arr[i][0]+" ");
        }
    }
}