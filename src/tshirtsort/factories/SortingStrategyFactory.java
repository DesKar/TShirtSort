package tshirtsort.factories;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.sorting.strategies.ISortingStrategy;
import tshirtsort.sorting.strategies.SortByColorAsc;
import tshirtsort.sorting.strategies.SortByColorDesc;
import tshirtsort.sorting.strategies.SortByFabricAsc;
import tshirtsort.sorting.strategies.SortByFabricDesc;
import tshirtsort.sorting.strategies.SortBySizeAsc;
import tshirtsort.sorting.strategies.SortBySizeDesc;

public class SortingStrategyFactory {
    
    public List<ISortingStrategy> generateSortingStrategies() {
        List<ISortingStrategy> sortingStrategies = new ArrayList<>();
        sortingStrategies.add(new SortBySizeAsc());
        sortingStrategies.add(new SortBySizeDesc());
        sortingStrategies.add(new SortByColorAsc());
        sortingStrategies.add(new SortByColorDesc());
        sortingStrategies.add(new SortByFabricAsc());
        sortingStrategies.add(new SortByFabricDesc());
        
        return sortingStrategies;
    }
    

    
}
