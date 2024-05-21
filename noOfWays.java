public class noOfWays {
    public static void main(String[] args) {
        
    }
    static int gridWaysRec(int m, int n, int i, int j){
        if(i==m-1 && j==n-1){
            return 1;
        }else if(i==n || j==m) return 0;
        return gridWaysRec(m, n, i+1, j) + gridWaysRec(m, n, i, j+1);
    }
}