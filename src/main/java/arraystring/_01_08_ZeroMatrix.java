package arraystring;

import java.util.ArrayList;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
class _01_08_ZeroMatrix {
    int[][] zero(int[][] matrix) {
        ArrayList<Integer> rowsZeroed = new ArrayList<>();
        ArrayList<Integer> colsZeroed = new ArrayList<>();

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == 0){
                    boolean rowAlreadyZeroed = rowsZeroed.contains(row);
                    boolean colAlreadyZeroed = colsZeroed.contains(col);

                    if(!rowAlreadyZeroed && !colAlreadyZeroed){
                        matrix = zeroRowAndCol(matrix, row, col);
                        rowsZeroed.add(row);
                        colsZeroed.add(col);
                    }
                }
            }
        }

        return matrix;
    }

    int[][] zeroRowAndCol(int[][] matrix, int row, int col){
        // zero row
        for(int j = 0; j < matrix[row].length; j++){
            matrix[row][j] = 0;
        }
        //zero col
        for(int i = 0; i < matrix.length; i++){
            matrix[i][col] = 0;
        }
        
        return matrix;
    }
}
