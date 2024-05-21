import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingPrblm {
    public static void main(String[] args) {
        int[][] info={{4,20,1},{1,10,2},{1,40,3},{1,30,4}};
        greedyWay(info);
    }
    // static class Info{

    // }
    static void greedyWay(int[][] info){
        Arrays.sort(info, Comparator.comparingDouble(o -> -o[1]));
        
        // Print the sorted array
        for (int[] arr : info) {
            System.out.println(Arrays.toString(arr));
        }
        int time=1;
        System.out.println(info[0][2]);
        for(int i=1;i<info.length;i++){
            if(info[i][0]>time){
                System.out.println(info[i][2]);
                time++;
            }
        }

    }
}
