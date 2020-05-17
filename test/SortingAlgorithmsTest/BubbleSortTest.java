package SortingAlgorithmsTest;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sortingstrategies.ISortingStrategy;
import tshirtsort.sortingstrategies.SortByColorAsc;
import tshirtsort.sortingstrategies.SortByColorDesc;
import tshirtsort.sortingstrategies.SortByFabricAsc;
import tshirtsort.sortingstrategies.SortByFabricDesc;
import tshirtsort.sortingstrategies.SortBySizeAsc;
import tshirtsort.sortingstrategies.SortBySizeDesc;

public class BubbleSortTest {

    ISortingAlgorithm bubbleSort;
    List<TShirt> tShirts;

    ISortingStrategy byColorAsc;
    ISortingStrategy byColorDesc;
    ISortingStrategy bySizeAsc;
    ISortingStrategy bySizeDesc;
    ISortingStrategy byFabricAsc;
    ISortingStrategy byFabricDesc;

    public BubbleSortTest() {
    }

    @Before
    public void setUp() {
        tShirts.add(new TShirt("Red-S-Cotton", Color.RED, Size.S, Fabric.COTTON));
        tShirts.add(new TShirt("Blue-M-Silk", Color.BLUE, Size.M, Fabric.SILK));
        tShirts.add(new TShirt("Violette-XXL-Polyester", Color.VIOLET, Size.XXL, Fabric.POLYESTER));
        tShirts.add(new TShirt("INDIGO-XS-CASHMERE", Color.INDIGO, Size.XS, Fabric.CASHMERE));
        tShirts.add(new TShirt("GREEN-XXXL-WOOL", Color.GREEN, Size.XXXL, Fabric.WOOL));

        byColorAsc = new SortByColorAsc();
        byColorDesc = new SortByColorDesc();
        bySizeAsc = new SortBySizeAsc();
        bySizeDesc = new SortBySizeDesc();
        byFabricAsc = new SortByFabricAsc();
        byFabricDesc = new SortByFabricDesc();
    }

    @Test
    public void BubbleSortByColorAscTest() {
        bubbleSort.sort(tShirts, byColorAsc);

    }

    @Test
    public void BubbleSortByColorDescTest() {
        bubbleSort.sort(tShirts, byColorDesc);

    }

    @Test
    public void BubbleSortBySizeAscTest() {
        bubbleSort.sort(tShirts, bySizeAsc);

    }

    @Test
    public void BubbleSortBySizeDescTest() {
        bubbleSort.sort(tShirts, bySizeDesc);

    }

    @Test
    public void BubbleSortByFabricAscTest() {
        bubbleSort.sort(tShirts, byFabricAsc);

    }

    @Test
    public void BubbleSortByFabricDescTest() {
        bubbleSort.sort(tShirts, byFabricDesc);

    }

}
