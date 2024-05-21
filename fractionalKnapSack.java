import java.util.Arrays;

public class fractionalKnapSack {
    public static void main(String[] args) {
        int[] value={60,100,120};
        int weight[]={10,20,30};
        int w=50;
        System.out.println(greedyWay(value, weight, w));
    }
    static int greedyWay(int[] value, int weight[], int maxWeight){
        int ans=0; 
        Wrapper[] arr= new Wrapper[value.length];
        for(int i=0;i<value.length;i++){
            arr[i]=new Wrapper(value[i], weight[i], value[i]/weight[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<value.length;i++){
            if(arr[i].wt<=maxWeight){
                //System.out.println(arr[i].val);
                ans+=arr[i].val;
                maxWeight-=arr[i].wt;
            }else{
                ans+=arr[i].ratio*maxWeight;
                //System.out.println(arr[i].ratio);
                //System.out.println(maxWeight);
                break;
            }
        }
        return ans;
    }
    static class Wrapper implements Comparable<Wrapper> {
        int val;
        int wt;
        int ratio;

        public Wrapper(int v, int w, int r) {
            this.val = v;
            this.wt = w;
            this.ratio = r;
        }

        @Override
        public int compareTo(Wrapper obj) {
            return obj.ratio - this.ratio;
        }
    }
}
