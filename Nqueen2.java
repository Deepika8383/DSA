public class Nqueen2 {
    public static void main(String[] args) {
        int[] ans = new int[4];
        backtrack(4,0, ans);
    }
    static void backtrack(int n, int i, int[] ans){
        if(i==n){
            print(ans);
            return;
        }
        for(int j=0;j<n;j++){
            if(digonal(ans, i, j) && column(ans, i, j)){
                ans[i]=j;
                backtrack(n, i+1, ans);
                ans[i]=0;
            }
        }
    }
    static void print(int[] arr){
        if (arr == null) {
            System.out.println("No solution");
            return;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "->");
        }
        System.out.print("end");
    }
    
    static boolean digonal(int[] board, int i, int j){
        for(int k=0;k<=i;k++){
            if(k != i && Math.abs(i - k) == Math.abs(j - board[k])){
                return false;
            }
        }
        return true;
    }
    static boolean column(int[] board,int i, int j){
        for(int k=i-1;k>=0;k--){
            if(board[k]==j){
                return false;
            }
        }
        return true;
    }
}
