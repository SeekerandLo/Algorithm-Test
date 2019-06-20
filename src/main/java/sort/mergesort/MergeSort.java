package sort.mergesort;

import sort.Sort;

import java.util.Arrays;

/**
 * data: 2019/6/1 10:52
 **/

public class MergeSort implements Sort {


    public MergeSort() {
    }

    private int[] mergeSort(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        if (l < r) {
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            //左右归并
            merge(arr, l, mid, r);
        }
        return arr;
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        if (temp.length >= 0) System.arraycopy(temp, 0, arr, l, temp.length);
    }

    @Override
    public int[] sort(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        return mergeSort(arr, l, r);
    }
}
