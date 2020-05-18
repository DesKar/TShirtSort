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
import tshirtsort.sorting.algorithms.BubbleSort;
import tshirtsort.sorting.algorithms.BucketSort;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sorting.algorithms.QuickSort;
import tshirtsort.sorting.strategies.ISortingStrategy;
import tshirtsort.sorting.strategies.SortByColorAsc;
import tshirtsort.sorting.strategies.SortByColorDesc;
import tshirtsort.sorting.strategies.SortByFabricAsc;
import tshirtsort.sorting.strategies.SortByFabricDesc;
import tshirtsort.sorting.strategies.SortBySizeAsc;
import tshirtsort.sorting.strategies.SortBySizeDesc;

public class SortingAlgorithmsTest {

    List<TShirt> tShirts = new ArrayList();

    ISortingAlgorithm bubbleSort = new BubbleSort();
    ISortingAlgorithm bucketSort = new BucketSort();
    ISortingAlgorithm quickSort = new QuickSort();

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
    TShirt tShirt6 = new TShirt("Blue-S-Silk", Color.BLUE, Size.S, Fabric.SILK);
    TShirt tShirt7 = new TShirt("Green-S-Cotton", Color.GREEN, Size.S, Fabric.COTTON);

    public SortingAlgorithmsTest() {
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
    public void BubbleSortByColorAscTest() {
        bubbleSort.sort(tShirts, byColorAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void BubbleSortByColorDescTest() {
        bubbleSort.sort(tShirts, byColorDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void BubbleSortBySizeAscTest() {
        bubbleSort.sort(tShirts, bySizeAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BubbleSortBySizeDescTest() {
        bubbleSort.sort(tShirts, bySizeDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt4);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BubbleSortByFabricAscTest() {
        bubbleSort.sort(tShirts, byFabricAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void BubbleSortByFabricDescTest() {
        bubbleSort.sort(tShirts, byFabricDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

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

    @Test
    public void QuickSortTestByColorAscTest() {
        quickSort.sort(tShirts, byColorAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void QuickSortTestByColorDescTest() {
        quickSort.sort(tShirts, byColorDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());
    }

    @Test
    public void QuickSortTestBySizeAscTest() {
        quickSort.sort(tShirts, bySizeAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void QuickSortTestBySizeDescTest() {
        quickSort.sort(tShirts, bySizeDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt4);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void QuickSortTestByFabricAscTest() {
        quickSort.sort(tShirts, byFabricAsc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt5);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt2);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }

    @Test
    public void QuickSortTestByFabricDescTest() {
        quickSort.sort(tShirts, byFabricDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirts.toArray(), tShirts.toArray());

    }
}
