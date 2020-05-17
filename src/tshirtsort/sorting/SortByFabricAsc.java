package tshirtsort.sorting;

import tshirtsort.models.Fabric;
import tshirtsort.models.TShirt;

public class SortByFabricAsc implements ISortingStrategy, IBucketSort {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t2.getFabric().ordinal() - t1.getFabric().ordinal();
    }
    
     @Override
    public int computeNrOfBuckets() {
        return Fabric.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
       return tShirt.getFabric().ordinal();
    }
}
