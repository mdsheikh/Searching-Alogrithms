/**
 * linearSearch
 */
public class linearSearch {
    public static int linear_search(int[] arr, int value) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int value = 56;
        int[] arr  = {12,34,56,7,8,9,99};
        long start = System.nanoTime();
        int result = linear_search(arr, value);
        long end = System.nanoTime();
        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Element found at index: " + result);
        }
        System.out.println("It took: " + (end - start) + " nanoseconds by using linear search");
    }
}