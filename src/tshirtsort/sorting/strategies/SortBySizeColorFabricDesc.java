package tshirtsort.sorting.strategies;

import tshirtsort.models.Size;
import tshirtsort.models.TShirt;

public class SortBySizeColorFabricDesc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        int bySize = t1.getSize().ordinal() - t2.getSize().ordinal();
        if (bySize != 0) {
            return bySize;
        }
        int byColor = t1.getColor().ordinal() - t2.getColor().ordinal();
        if (byColor != 0) {
            return byColor;
        }
        int byFabric = t1.getFabric().ordinal() - t2.getFabric().ordinal();
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
        return "SortBySizeColorFabricDesc";
    }
}
