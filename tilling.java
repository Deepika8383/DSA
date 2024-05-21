public class tilling {
    public static void main(String[] args) {
        System.out.println(waysOfTilling(4));
    }
    static int waysOfTilling(int n){
        if(n==1 || n==0) return 1;
        int ans=0;
        if(n-1>=0) ans+= waysOfTilling(n-1);
        if(n-2>=0) ans+= waysOfTilling(n-2);
        return ans; 
    }
}
