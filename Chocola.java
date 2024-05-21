import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Chocola {
    public static void main(String[] args) {
        Integer costVer[]={2,1,3,1,4}; Integer costHori[]={4,1,2};
        System.out.println(greedyWay(costVer, costHori));
    }
    static int greedyWay(Integer[] cv, Integer[] ch){
        Arrays.sort(cv, Collection.reverseOrder());
        Arrays.sort(ch, Collection.reverseOrder());
        int hp=1; int vp=1;
        int hc=0; int vc=0;
        int cost=0;
        while(hc<ch.length && vc<cv.length){
            if(cv[vc]<=ch[hc]){
                cost+=cv[vc]*hp;
                vp++;  vc++;
            }else{
                cost+=ch[hc]*vp;
                hp++;  hc++;
            }
            System.out.println(cost);
        }
        while (hc<ch.length) {
            cost+=ch[hc]*vp;
            hp++;  hc++;
        }
        while (vc<cv.length) {
            cost+=cv[vc]*hp;
            vp++;  vc++;
        }
        System.out.println(cost+"  final");
        return cost;
    }
}
