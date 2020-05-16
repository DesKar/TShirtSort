package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public class SortByFabricAsc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t2.getFabric().ordinal() - t1.getFabric().ordinal();
    }
}
