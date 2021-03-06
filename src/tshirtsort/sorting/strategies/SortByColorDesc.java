package tshirtsort.sorting.strategies;

import tshirtsort.models.Color;
import tshirtsort.models.TShirt;

public class SortByColorDesc implements ISortingStrategy {

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

    @Override
    public String toString() {
        return "SortByColorDesc";
    }

}
