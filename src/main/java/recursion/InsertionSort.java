package recursion;

public class InsertionSort {


    /***
     * sort(arr[]) will sort all the elements of an array
     * sort(arr[length - 1] will sort all the elements of length -1
     * sort(arr[0]) base condition, single element will be always sorted
     * now induction step we need to make use like if sort(arr[0:n-1])
     * if already sorted then how can we sort after adding one more element
     */


    //end is exclusive
    //start is starting with 0
    public static void sortAnArray(int[] arr, int start, int end){
        if(start == end){
            return;
        }
        sortAnArray(arr, start, end-1);
        int j = end-1;
        for(int i = end-2;i>=0;i--){
            if(arr[i]>arr[j]){
                swap(arr,i,j);
                j = i;
            }else{
                break;
            }

        }


    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
         arr[x] = arr[y];
         arr[y] = temp;
    }

    // Utility to print array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = { 5,3,1,5,4,6,6,7,1};
        printArray(arr);
        sortAnArray(arr,0,arr.length);
        printArray(arr);
    }
}
