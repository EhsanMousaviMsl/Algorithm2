package Heap.MaxHeap.Implementation.ArrayBased;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxHeapBuilder {
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int biggest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[biggest])
            biggest = left;
        if (right < n && arr[right] > arr[biggest])
            biggest = right;
        if(biggest != i) {
            swap(arr, i , biggest);
            heapify(arr, n, biggest);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,4,1,2};
        buildMaxHeap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
