import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,9,1,2,3,6,1,7,1,2,8};
        System.out.println(maxCount(arr));
    }
    public static int maxCount(int[] arr){
	    Arrays.sort(arr);
	    int maxCount=0; int currCount=0; int maxElemnt=0;
	    for(int i=0;i<arr.length;i++){
	        int currEle=arr[i]; currCount=0;
	        while(i<arr.length && arr[i]==currEle){
	            currCount++;
	            i++;
	        }
            System.out.println(currCount +" : "+ currEle);
	        i--;
	        if(currCount>maxCount){
	            maxCount=currCount;
	            maxElemnt=arr[i];
	        }
	    }
        return maxElemnt;
	}
}
