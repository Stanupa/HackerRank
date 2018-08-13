public class MyClass {
    public static void main(String args[]) {
        int[] testArray = {2, 1, 7, 6, 3, 1, 45};
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        mergeSort(testArray);
        
        System.out.println("after...");
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int[] arr) {
        mergeHelper(arr);
    }
    
    public static void mergeHelper(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length - (arr.length/2)];
        for (int i = 0; i < arr.length/2; i++) {
            left[i] = arr[i];
        }
        int i = 0;
        for (int j = arr.length/2; j < arr.length; j++) {
            right[i] = arr[j];
            i++;
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }
    
    private static void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            }
            else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
        }
        while (j < right.length) {
                arr[k] = right[j];
                k++;
                j++;
        }
    }
    
}
