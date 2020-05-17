package tshirtsort.sorting.algorithms;

import java.util.List;
import tshirtsort.models.TShirt;
import tshirtsort.sortingstrategies.ISortingStrategy;

public class BubbleSort implements ISortingAlgorithm {

    @Override
    public void sort(List<TShirt> arr, ISortingStrategy sortingStrategy) {
        int n = arr.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                int compareResult = sortingStrategy.compare(arr.get(j), arr.get(j + 1));
                if (compareResult < 0) {

                    TShirt temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);

                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }

}
