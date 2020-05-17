package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public interface IBucketSort {
    
    int computeNrOfBuckets();
    
    int getBucket(TShirt tShirt);
    
}
