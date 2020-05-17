package tshirtsort.factories;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.sorting.algorithms.BubbleSort;
import tshirtsort.sorting.algorithms.BucketSort;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sorting.algorithms.QuickSort;

public class SortingAlgorithmFactory {

    public List<ISortingAlgorithm> generateSortingAlgorithms() {
        List<ISortingAlgorithm> sortingAlgorithms = new ArrayList<>();
        sortingAlgorithms.add(new QuickSort());
        sortingAlgorithms.add(new BubbleSort());
        sortingAlgorithms.add(new BucketSort());
        
        return sortingAlgorithms;
    }

}