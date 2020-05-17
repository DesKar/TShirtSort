package tshirtsort.sorting;

import tshirtsort.models.Color;
import tshirtsort.models.TShirt;

public class SortByColorDesc implements ISortingStrategy, IBucketSort {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t1.getColor().ordinal() - t2.getColor().ordinal();
    }

    @Override
    public int computeNrOfBuckets() {
        return Color.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
        return computeNrOfBuckets() - tShirt.getColor().ordinal() - 1;
    }
}
