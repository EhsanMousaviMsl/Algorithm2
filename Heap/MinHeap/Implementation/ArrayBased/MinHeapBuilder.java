import java.util.Arrays;

public class MinHeapBuilder {

    public static void buildMinHeap(int[] arr) {
        int n = arr.length;
        // start from last non-leaf node and heapifydown
        // heapifydown : we find the last non-leaf node (n/2 - 1):
        // and apply heapyfy() downwards

        for(int i = n/2 - 1; i >= 0; i--)  {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[left] < arr[smallest])
            smallest = left;
        if (right < n && arr[right] < arr[smallest])
            smallest = right;
        if (smallest != i) {
            swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,4,1,2};
        buildMinHeap(arr);
        System.out.println("Min-Heap: " + Arrays.toString(arr));
    }
}

