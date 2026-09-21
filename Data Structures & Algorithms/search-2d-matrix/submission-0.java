class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        /*

        with this problem we can treat it as some sort of 1d array

        if the r = row*cols - 1 
        and l = 0

        then the middle will be at some matrix[i][j]

        to find i we need to see how rows go into this index /
        and for the column you see what is the remainder of this index

        and then if value = matrix[i][j] > target r = mid - 1

        else if matrix[i][j] < target r = mid + 1

        //how many times does 4 go into 5 and then whats the remainder

        */


        int l = 0;
        int r = (matrix.length * matrix[0].length) - 1; //0 indexed


        while(l<=r){
            //calculate the middle
            int mid = l + (r - l) / 2;
            //where does this middle lie 
            int value = 
            matrix[mid/matrix[0].length][mid%matrix[0].length];

            if(value>target){
                //move the bottom up
                r = mid - 1;
            }else if(value<target){
                //move the top up
                l = mid + 1;
            }else{
                return true;

            }
        }
        return false;

        
    }
}
