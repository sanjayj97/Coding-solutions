class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        for(int r = 0; r < l; r++){
            for(int c = r; c < l; c++){
                int t = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = t;
            }
        }
        int i = 0;
        while(i < l){
            for(int c = 0;c < l/2; c++ ){
                int v = l-c-1;
                int t = matrix[i][c];
                matrix[i][c] = matrix[i][v];
                matrix[i][v] = t;                
            }
            i++;
        }
    }
}