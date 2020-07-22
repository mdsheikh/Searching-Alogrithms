public class jumpSearch {

    public static int jump_search(int[] arr, int key,  int left, int right) {

        // finding block size
        int block = (int) Math.floor(Math.sqrt(right-1));
        // finding block 
        int count = left + block;
        while(count < right && arr[count] < key)
        left = count - block;
        right = Math.min(count, right);
        for (int i = 1; i <= arr.length; i++) {
            if(arr[i] == key)
            return i;
        
        }
        return -1;

    }
    

    public static void main(String[] args) {
        int[] arr = {1,34,56,78,3,4,55,23,44};
        int x = 3;
        long st = System.nanoTime();
        int result =  jump_search(arr, x, 0, arr.length-1);
        long et = System.nanoTime();
        if(result == -1){
            System.out.println("Not found");
            System.out.println("It took: " + (et - st) + " nanoseconds to search");
        } else{
        System.err.println("It found at index: " + result);
        System.out.println("It took: " + (et -st) + " nanoseconds to find");
        }
        
    }
    
}