public class ternarySearch {
    public static int ternary_search(int[] arr, int key, int low, int high){
        if(high < low || key < arr[low] || key > arr[high]) return -1;

        // finding 2 mid
        int mid1 = low + (high - low)/3;
        int mid2 = high - (high-low)/3;
        if(arr[mid1] == key) return mid1;
        if(arr[mid2] == key) return mid2;
        if(key < arr[mid1])
            return ternary_search(arr, key, low, mid1-1);  
        
        if(key > arr[mid2])
            return ternary_search(arr, key, mid2+1, high);
        
        return ternary_search(arr, key, mid1+1, mid2-1);
        
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,4,5,6,7,8,9,10};
        int key = 9;
        long st = System.nanoTime();
        int result = ternary_search(arr, key, 0, arr.length-1);
        long et = System.nanoTime();
        if(result == -1){
            System.out.println("Not found");
            System.out.println("it took: " + (et - st) + " nanosecons to search" );

        }
        else{
            System.out.println("Found at index: " + result);
            System.out.println("it took:" + (et - st) + " nanoseconds to find");
        }




    }
    
}