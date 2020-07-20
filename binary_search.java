public class binary_search {

    public static int binarySearchRecursive(int[] arr, int left, int right, int element) {
        // recursive method
        if(right >= left){

            int mid = left + (right-left)/2;
            if(arr[mid] == element){
                return mid;
            }
            if(arr[mid] > element){
               return binarySearchRecursive(arr, left, mid - 1, element);
            }
            else{
                return binarySearchRecursive(arr, mid + 1, right, element);
            }

        }
        return -1;
        
    }
    public static int binarySearchIterative(int[] arr, int element){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){

            int mid = left + (right - left)/2;
            if(arr[mid] == element)
                return mid;
            
            
            if(arr[mid] < element)
                left = mid + 1;
            
            else
                right = mid - 1;
  
        }
        return -1;   
    } 

    public static void main(String[] args) {
        
        int[] arr = {12,34,56,2,3,45,88,44};
        int element = 45;
        int left = 0;
        int right = arr.length;
        long rbs1 = System.nanoTime();
        int result1 = binarySearchRecursive(arr, left, right-1, element);
        long rbs2 = System.nanoTime();
        if(result1 == -1){ 
            System.out.println("Not found");
        }  else{
            System.out.println("Element found at index: " + result1);
        }
        System.out.println("It took: " + (rbs2-rbs1) + " nanoseconds by using recursive mehthod.");

        long ibs1 = System.nanoTime();
        int result2 = binarySearchIterative(arr, element);
        long ibs2 = System.nanoTime();
        if(result2 == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Element found at index: " + result2);
        }
        System.out.println("It too: " + (ibs2-ibs1) + " nanoseconds by using iterative method.");

    }
    
}