package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public class SortByColorAsc implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t2.getColor().ordinal() - t1.getColor().ordinal();
    }
}
