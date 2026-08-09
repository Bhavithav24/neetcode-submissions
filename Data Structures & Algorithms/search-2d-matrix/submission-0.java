class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l =  0, a = 0, r = matrix.length - 1, b = matrix[0].length - 1;
        
        while(l <= r){
            int mid = l + (r-l)/2;
            if(matrix[mid][0] <= target && matrix[mid][b] >= target){
                int x = a, y = b;
                while(x <= y){
                    int m = x + (y - x)/2;
                    if(matrix[mid][m] == target){
                        return true;
                    }

                    else if (matrix[mid][m] > target){
                        y = m - 1;
                    }
                    else{
                        x = m + 1;
                    }
                }
                
                return false;
            }

            else if(matrix[mid][0] > target){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return false;
    }
}