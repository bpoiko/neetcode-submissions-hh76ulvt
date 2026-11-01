class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = (matrix.length * matrix[0].length)-1;
        int mid = 0;
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        while(low <= high){
             mid = low + (high - low) / 2;
            if(matrix[mid / matrix[0].length][mid % matrix[0].length] == target){
                return true;
            }else if(target > matrix[mid / matrix[0].length][mid % matrix[0].length] ){
                 low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return false;
    }
}
