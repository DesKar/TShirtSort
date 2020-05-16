package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public class SortBySizeAsc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t2.getSize().ordinal() - t1.getSize().ordinal();
    }
}
