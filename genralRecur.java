public class genralRecur {
    public static void main(String[] args) {
        System.out.println(printXpowerN(2, 5));
    }
    static int firstOcc(int[] arr, int key, int i){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        else return firstOcc(arr, key, i+1);
    }
    static int lastOcc(int[] arr, int key, int i){
        if(i<0) return -1;
        if(arr[i]==key) return i;
        else return lastOcc(arr, key, i-1);
    }
    static int printXpowerN(int x, int n){
        if(n==0) return 1;
        if(n%2==0){
            int half=printXpowerN(x, n/2);
            return half*half;
        }else{
            int half=printXpowerN(x, n/2);
            return half*half*x;
        }
    }
}
