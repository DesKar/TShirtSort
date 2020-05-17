package tshirtsort.sorting.algorithms;

import java.util.List;
import tshirtsort.models.TShirt;
import tshirtsort.sortingstrategies.ISortingStrategy;

public interface ISortingAlgorithm {

    public void sort(List<TShirt> arr, ISortingStrategy sortingStrategy);

}
