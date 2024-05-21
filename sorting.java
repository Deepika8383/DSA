public class sorting {
    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        insertion_sort(arr);
        printArray(arr);

    }
    static void bubble_sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swap=true;
                }
            }
            if(!swap) return;
        }
    }
    static void selection_sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]) minPos=j;
            }
            swap(arr, i, minPos);
        }
    }
    static void insertion_sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    static void counting_sort(int[] arr){

    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i + " -> ");
        }
    }
}
