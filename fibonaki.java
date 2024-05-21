public class fibonaki {
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        //     System.out.println(fibonaciMemo(i));
        // }
        int[] arr1={1,2,3,4,5};
        int arr2[]={8,6,9,1,2,3};
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr1));
    }
    static int fibonaciRec(int n){
        if(n==0 || n==1) return n;
        return fibonaciRec(n-1)+fibonaciRec(n-2);
    }
    static int fibonaciDpTab(int n){
        if(n==0 || n==1) return n;
        int[] dp= new int[n+1];
        dp[0]=0; dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    static int fibonaciMemo(int n){
        if(n==0 || n==1) return n;
        int[] dp= new int[n+1];
        dp[0]=0; dp[1]=1;
        return helper(n, dp);
    }
    static int helper(int n, int[] dp){
        if(n==0 || n==1) return n;
        if(dp[n]!=0) return dp[n];
        return helper(n-1, dp) + helper(n-2, dp);
    }
    static boolean isSorted(int[] arr){
        if(arr.length==1) return true;
        return helper(arr, 1);
    }
    static boolean helper(int[] arr, int i){
        if(i==arr.length) return true;
        if(arr[i]>arr[i-1]) return helper(arr, i+1);
        else return false; 
    }
}
