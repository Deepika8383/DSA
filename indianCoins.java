import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        System.out.println(greedyWay(254, coins));
    }
    static int greedyWay(int amt, Integer[] coins){
        int countOfCoins=0;
        Arrays.sort(coins, Comparator.reverseOrder());
        for(int i=0;i<coins.length;i++){
            while(coins[i]<=amt){
                countOfCoins++;
                System.out.println(coins[i]);
                amt-=coins[i];
            }
        }
        return countOfCoins;
    }

}
