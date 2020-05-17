package tshirtsort.sorting.algorithms;

import java.util.List;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.strategies.ISortingStrategy;

public class QuickSort implements ISortingAlgorithm {

    @Override
    public void sort(List<TShirt> arr, ISortingStrategy sortingStrategy) {
        quickSort(arr, 0, arr.size() - 1, sortingStrategy);
    }

    private void quickSort(List<TShirt> arr, int low, int high, ISortingStrategy sortingStrategy) {
        if (low < high) {
            int pi = partition(arr, low, high, sortingStrategy);

            quickSort(arr, low, pi - 1, sortingStrategy);
            quickSort(arr, pi + 1, high, sortingStrategy);
        }
    }

    private int partition(List<TShirt> arr, int low, int high, ISortingStrategy sortingStrategy) {
        TShirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            int compareResult = sortingStrategy.compare(arr.get(j), pivot);
            if (compareResult > 0) {
                i++;

                TShirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        TShirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }

    @Override
    public String toString() {
        return "QuickSort";
    }

}
