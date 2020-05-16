package tshirtsort.sorting;

import tshirtsort.models.TShirt;

public class SortByColorDesc implements ISortingStrategy{

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t1.getColor().ordinal() - t2.getColor().ordinal();
    }
}
