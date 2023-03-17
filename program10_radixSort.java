public class RadixSort {
    public static void radixSort(int arr[]) {
        int n = arr.length;

        // Find the maximum number to know the number of digits
        int max_num = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max_num)
                max_num = arr[i];
        }

        // Do counting sort for every digit, starting from the least significant digit
        for (int exp = 1; max_num / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void countingSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }

        // Change count[i] so that it contains actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        radixSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



