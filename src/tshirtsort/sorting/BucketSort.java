package tshirtsort.sorting;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.models.TShirt;

public class BucketSort {

    public void sort(List<TShirt> arr, IBucketSort sortingStrategy) {
        int noOfBuckets = sortingStrategy.computeNrOfBuckets();
        bucketSort(arr, noOfBuckets, sortingStrategy);
    }

    private void bucketSort(List<TShirt> arr, int noOfBuckets, IBucketSort sortingStrategy) {
        List<TShirt>[] buckets = new List[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (TShirt tShirt : arr) {
            int index = sortingStrategy.getBucket(tShirt);
            buckets[index].add(tShirt);
        }

        int i = 0;
        for (List<TShirt> bucket : buckets) {
            for (TShirt tshirt : bucket) {
                arr.set(i, tshirt);
                i++;
            }
        }
    }
    
    private void printBucket(List<TShirt> shirts){
        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
        System.out.println("-----------------------");
    }

}
