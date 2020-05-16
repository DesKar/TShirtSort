package tshirtsort.sorting;

import tshirtsort.models.TShirt;


public class SortBySizeDesc  implements ISortingStrategy {

    @Override
    public int compare(TShirt t1, TShirt t2) {
        return t1.getSize().ordinal() - t2.getSize().ordinal();
    }

    
}
