package arraystring;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
// TODO
class _01_07_RotateMatrix {
    int[][] rotate(int[][] m) {
        int matrixSize = m.length;

        if(matrixSize == 1){
            return m;
        }

        for(int i = 0; i < (int)Math.ceil(matrixSize / 2); i++){
            int leftBound = i, rightBound = matrixSize - i - 1;

            while(leftBound <= rightBound){


                leftBound++;
            }
        }
    }
}