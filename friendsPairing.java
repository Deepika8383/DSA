public class friendsPairing {
    public static void main(String[] args) {
        System.out.println("Recur");
        System.out.println(byDpTab(7));
        System.out.println("byDpTab");
        System.out.println(byDpTab(7));
    }
    static int byRecursion(int n){
        if(n==1 || n==2) return n;
        return byRecursion(n-1) + (n-1)*byRecursion(n-2);
    }
    static int byDpTab(int n){
        if(n==1 || n==2) return n;
        int[] dp=new int[n+1];
        dp[1]=1; dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]= (i-1)*dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
