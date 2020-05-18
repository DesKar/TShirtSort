package tshirtsort.sorting.strategies;

import tshirtsort.models.Size;
import tshirtsort.models.TShirt;

public class SortBySizeColorFabricAsc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        int bySize = t2.getSize().ordinal() - t1.getSize().ordinal();
        if (bySize != 0) {
            return bySize;
        }
        int byColor = t2.getColor().ordinal() - t1.getColor().ordinal();
        if (byColor != 0) {
            return byColor;
        }
        int byFabric = t2.getFabric().ordinal() - t1.getFabric().ordinal();
        return byFabric;
    }

    @Override
    public int computeNrOfBuckets() {
        return Size.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
        return tShirt.getSize().ordinal();
    }

    @Override
    public String toString() {
        return "SortBySizeColorFabricAsc";
    }

}
