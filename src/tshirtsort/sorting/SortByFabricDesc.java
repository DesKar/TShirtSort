package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public class SortByFabricDesc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t1.getFabric().ordinal() - t2.getFabric().ordinal();
    }

}