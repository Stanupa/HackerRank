public class MyClass {
    
    public static void main(String args[]) {
        int[] test = {2, 6, 3, 5, 1, 7, 6, 10, 4};
        quickSort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
        System.out.println();
    }
    
    public static void quickSort(int[] arr) {
        helpSort(arr, 0, arr.length - 1);
    }
    
    private static void helpSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = arr[high];
        int oldLow = low;
        int wall = low;
        
        while (low < high) {
            if (arr[low] < pivot) {
                swap(arr, wall, low);
                wall++;
            }
            low++;
        }
        swap(arr, wall, high);
        helpSort(arr, oldLow, wall - 1);
        helpSort(arr, wall + 1, high);
    }
    
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    
}
