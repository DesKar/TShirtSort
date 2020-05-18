package tshirtsort.sorting.strategies;

import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
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
        return Size.values().length * Color.values().length * Fabric.values().length;
    }

    @Override
    public int getBucket(TShirt tShirt) {
        int size = tShirt.getSize().ordinal();
        int color = tShirt.getColor().ordinal();
        int fabric = tShirt.getFabric().ordinal();
        int colorLength = Color.values().length;
        int fabricLength = Fabric.values().length;
        return (colorLength * fabricLength * size) + (fabricLength * color) + fabric;
    }

    @Override
    public String toString() {
        return "SortBySizeColorFabricAsc";
    }

}
