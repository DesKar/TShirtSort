package tshirtsort.factories;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.sortingstrategies.ISortingStrategy;
import tshirtsort.sortingstrategies.SortByColorAsc;
import tshirtsort.sortingstrategies.SortByColorDesc;
import tshirtsort.sortingstrategies.SortByFabricAsc;
import tshirtsort.sortingstrategies.SortByFabricDesc;
import tshirtsort.sortingstrategies.SortBySizeAsc;
import tshirtsort.sortingstrategies.SortBySizeDesc;

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
