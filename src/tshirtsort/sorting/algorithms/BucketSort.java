package tshirtsort.sorting.algorithms;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.models.TShirt;
import tshirtsort.sortingstrategies.ISortingStrategy;

public class BucketSort implements ISortingAlgorithm {

    @Override
    public void sort(List<TShirt> arr, ISortingStrategy sortingStrategy) {
        int noOfBuckets = sortingStrategy.computeNrOfBuckets();
        bucketSort(arr, noOfBuckets, sortingStrategy);
    }

    private void bucketSort(List<TShirt> arr, int noOfBuckets, ISortingStrategy sortingStrategy) {
        List<TShirt>[] buckets = new List[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        arr.forEach((tShirt) -> {
            int index = sortingStrategy.getBucket(tShirt);
            buckets[index].add(tShirt);
        });

        int i = 0;
        for (List<TShirt> bucket : buckets) {
            for (TShirt tshirt : bucket) {
                arr.set(i, tshirt);
                i++;
            }
        }
    }

    @Override
    public String toString() {
        return "BucketSort";
    }

}
