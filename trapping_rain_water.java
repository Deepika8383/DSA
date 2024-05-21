public class trapping_rain_water{
    public static void main(String[] args){
        int[] heights={4,2,0,6,3,2,5};
        System.out.println(ans(heights));
    }
    static int ans(int[] height){
        int ans=0;
        int n=height.length;
        // left greatest
        int[] left= new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(height[i], left[i-1]);
            //System.out.println(left[i] + " left "+ i);
        }
        //right greatest
        int[] right= new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i], right[i+1]);
            //System.out.println(right[i] + " right "+ i);
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i], right[i])- height[i];
        }
        return ans;
    }
}