import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPair {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(greedyWay(pairs));
    }
    static int greedyWay(int[][] pairs){
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int count=1;
        int end=pairs[0][1];
        // for(int i=0;i<pairs.length;i++){
        //     //for(int j=0;j<2;j++){
        //         System.out.println(pairs[i][0]+"->"+ pairs[i][1]);
        //    // }
        //     //System.out.println();
        // }
        for(int i=1;i<pairs.length;i++){
            if(end<pairs[i][0]){
                count++;
                end=pairs[i][1];
            }
        }
        return count;
    }
}
