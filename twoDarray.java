public class twoDarray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4,98},
                         {5,6,7,8,76},
                         {13,14,15,16,65}};
        spiralMatrix(matrix);
    }
    public static void spiralMatrix(int[][] matrix){
        int sRow=0; int eRow=matrix.length-1;
        int sCol=0; int eCol=matrix[0].length-1;
        while (sRow<=eRow && sCol<=eCol) {
            //top left to right
            for(int j=sCol;j<=eCol;j++){
                System.out.println(matrix[sRow][j]);
            }
            //left top to bottom
            for(int i=sRow+1;i<=eRow;i++){
                System.out.println(matrix[i][eCol]);
            }
            //bottom left to right
            for(int j=eCol-1; j>=sCol;j--){
                if(sRow==eRow) break;
                System.out.println(matrix[eRow][j]);
            }
            //right bottom to up
            for(int i=eRow-1;i>sRow;i--){
                if(sCol==eCol) break;
                System.out.println(matrix[i][sCol]);
            }
            sRow++; eRow--;
            sCol++; eCol--;
        }
    }
}
