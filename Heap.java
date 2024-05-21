import java.util.ArrayList;

public class Heap {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> arr= new ArrayList<>();
    public static void insert(int data){
        arr.add(data);
        int x= arr.size()-1; int par=(x-1)/2;
        while(arr.get(x)<arr.get(par)){
            int temp=arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }
    }
    public static int peek(){
        return arr.get(0);
    }
    public static int remove(){
        int data=peek();
        // swap
        int temp=arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp); 
        //step2
        arr.remove(arr.size()-1);
        heapify(0);
        return data;
    }
    public static void heapify(int idx){
        int left=2*idx+1; int right=2*idx+2;
        int minIdx=idx;
        if(left<arr.size() && arr.get(left)<arr.get(minIdx)) minIdx = left;
        if(right<=arr.size() && arr.get(right)<arr.get(minIdx)) minIdx=right;
        if(minIdx!=idx){
            int temp=arr.get(minIdx);
            arr.set(minIdx, arr.get(idx));
            arr.set(idx, temp);
            heapify(minIdx);
        }
    }
    public static boolean isEmpty(){
        return arr.size()==0;
    }
}
