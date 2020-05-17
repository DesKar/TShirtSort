package tshirtsort.sorting;

import tshirtsort.models.Size;
import tshirtsort.models.TShirt;

public class SortBySizeAsc implements ISortingStrategy, IBucketSort {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t2.getSize().ordinal() - t1.getSize().ordinal();
    }
    
     @Override
    public int computeNrOfBuckets() {
        return Size.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
       return tShirt.getSize().ordinal();
    }
}
