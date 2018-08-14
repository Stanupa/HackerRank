public class MyClass {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 2));
    }
    
    public static int binarySearch(int[] arr, int val) {
        return helper(arr, 0, arr.length - 1, val);
    }
    
    private static int helper(int[] arr, int low, int high, int val) {
        int mid = (low + high) / 2;
        if (arr[mid] == val) {
            return mid;
        }
        if (low >= high) {
            return -1;
        }
        if (arr[mid] > val) {
            return helper(arr, low, mid-1, val);
        }
        else {
            return helper(arr, mid + 1, high, val);
        }
    }
    
}
