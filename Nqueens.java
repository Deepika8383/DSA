public class Nqueens {
    static int count=0;
    public static void main(String[] args) {
        char[][] board= new char[8][8];
        System.out.println(allPossSol(board, 0));
    }
    static boolean allPossSol(char[][] board, int row){
        boolean ans= false;
        if(row==board.length){
            print(board);
            //System.out.println();
            //count++;
            System.out.println("true");
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(top(board, row, j)  && diagonal(board, row, j)){
                board[row][j]='Q';
                System.out.println(row + ", "+ j);
                ans= allPossSol(board, row+1);
                if(ans)return ans;
                board[row][j] = ' ';// backtrack && left(board, row, j)
            }else{
                board[row][j]=' ';
            }
        }
        return ans;
    }
    static void print(char[][] board){
        for(int i=0;i<board.length;i++){
            System.out.print("|");
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
        }
    }
    static boolean top(char[][] board, int row, int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
    // static boolean left(char[][] board, int row, int col){
    //     for(int j=col-1;j>=0;j--){
    //         if(board[row][j]=='Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    static boolean diagonal(char[][] board, int row, int col){
        // Check upper-left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
    
        // Check upper-right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
    
        return true;
    }
    
}
