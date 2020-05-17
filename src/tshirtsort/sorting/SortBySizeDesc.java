package tshirtsort.sorting;

import tshirtsort.models.Size;
import tshirtsort.models.TShirt;


public class SortBySizeDesc  implements ISortingStrategy, IBucketSort {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t1.getSize().ordinal() - t2.getSize().ordinal();
    }
    
    @Override
    public int computeNrOfBuckets() {
        return Size.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
        return computeNrOfBuckets() - tShirt.getSize().ordinal() - 1;
    }

    
}
