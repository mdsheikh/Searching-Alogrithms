/**
 * interpolationSearch
 */
public class interpolationSearch {

    public static int interpolation_search(int[] arr, int key, int low, int high) {
        if (high < low || key < arr[low] || key > arr[high])
            return -1;
        // probing the position with uniform distribution
        int pos = low + (((high - low) / (arr[high] - arr[low])) * (key - arr[low]));
        if (arr[pos] == key)
            return pos;
        if (key < arr[pos]) {
            return interpolation_search(arr, key, low, pos - 1);
        }
        return interpolation_search(arr, key, pos + 1, high);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 8;
        int n = arr.length;
        long st = System.nanoTime();
        int result = interpolation_search(arr, key, 0, n - 1);
        long et = System.nanoTime();
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("It if found at index:" + result);
            System.out.println("It took: " + (et - st) + " nanoseconds to find");
        }

    }
}