package SortingAlgorithmsTest;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.algorithms.BucketSort;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sortingstrategies.ISortingStrategy;
import tshirtsort.sortingstrategies.SortByColorAsc;
import tshirtsort.sortingstrategies.SortByColorDesc;
import tshirtsort.sortingstrategies.SortByFabricAsc;
import tshirtsort.sortingstrategies.SortByFabricDesc;
import tshirtsort.sortingstrategies.SortBySizeAsc;
import tshirtsort.sortingstrategies.SortBySizeDesc;

public class BucketSortTest {

    ISortingAlgorithm bucketSort = new BucketSort();
    List<TShirt> tShirts = new ArrayList();

    ISortingStrategy byColorAsc = new SortByColorAsc();
    ISortingStrategy byColorDesc = new SortByColorDesc();
    ISortingStrategy bySizeAsc = new SortBySizeAsc();
    ISortingStrategy bySizeDesc = new SortBySizeDesc();
    ISortingStrategy byFabricAsc = new SortByFabricAsc();
    ISortingStrategy byFabricDesc = new SortByFabricDesc();

    TShirt tShirt1 = new TShirt("Red-S-Cotton", Color.RED, Size.S, Fabric.COTTON);
    TShirt tShirt2 = new TShirt("Blue-M-Silk", Color.BLUE, Size.M, Fabric.SILK);
    TShirt tShirt3 = new TShirt("Violette-XXL-Polyester", Color.VIOLET, Size.XXL, Fabric.POLYESTER);
    TShirt tShirt4 = new TShirt("Indigo-XS-Cashmere", Color.INDIGO, Size.XS, Fabric.CASHMERE);
    TShirt tShirt5 = new TShirt("Green-XXXL-Wool", Color.GREEN, Size.XXXL, Fabric.WOOL);

    public BucketSortTest() {
    }

    @Before
    public void setUp() {
        tShirts.add(tShirt1);
        tShirts.add(tShirt2);
        tShirts.add(tShirt3);
        tShirts.add(tShirt4);
        tShirts.add(tShirt5);
    }

    @Test
    public void BucketSortTestByColorAscTest() {
        bucketSort.sort(tShirts, byColorAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void BucketSortTestByColorDescTest() {
        bucketSort.sort(tShirts, byColorDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void BucketSortTestBySizeAscTest() {
        bucketSort.sort(tShirts, bySizeAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BucketSortTestBySizeDescTest() {
        bucketSort.sort(tShirts, bySizeDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt4);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BucketSortTestByFabricAscTest() {
        bucketSort.sort(tShirts, byFabricAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BucketSortTestByFabricDescTest() {
        bucketSort.sort(tShirts, byFabricDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }
}
