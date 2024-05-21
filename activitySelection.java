import java.util.ArrayList;

public class activitySelection {
    public static void main(String[] args) {
        
    }
    static void greedyWay(int[] st, int[] end){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0);
        int lastEnd=end[0];
        int maxAct=1;
        for(int i=1;i<st.length;i++){
            if(st[i]>lastEnd){
                maxAct++;
                arr.add(i);
                lastEnd=end[i];
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
