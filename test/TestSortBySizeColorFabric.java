
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.algorithms.BubbleSort;
import tshirtsort.sorting.algorithms.BucketSort;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sorting.algorithms.QuickSort;
import tshirtsort.sorting.strategies.ISortingStrategy;
import tshirtsort.sorting.strategies.SortBySizeColorFabricAsc;
import tshirtsort.sorting.strategies.SortBySizeColorFabricDesc;

public class TestSortBySizeColorFabric {

    List<TShirt> tShirts = new ArrayList();
    List<TShirt> sortedTShirtsAsc = new ArrayList<>();
    List<TShirt> sortedTShirtsDesc = new ArrayList<>();

    ISortingAlgorithm bubbleSort = new BubbleSort();
    ISortingAlgorithm bucketSort = new BucketSort();
    ISortingAlgorithm quickSort = new QuickSort();

    ISortingStrategy bySizeColorFabricAsc = new SortBySizeColorFabricAsc();
    ISortingStrategy bySizeColorFabricDesc = new SortBySizeColorFabricDesc();

    TShirt tShirt1 = new TShirt("Red-S-Cotton", Color.RED, Size.S, Fabric.COTTON);
    TShirt tShirt2 = new TShirt("Red-S-Silk", Color.RED, Size.S, Fabric.SILK);

    TShirt tShirt3 = new TShirt("Blue-M-Silk", Color.BLUE, Size.M, Fabric.SILK);
    TShirt tShirt4 = new TShirt("Violete-M-Silk", Color.VIOLET, Size.M, Fabric.SILK);

    TShirt tShirt5 = new TShirt("Violette-XXL-Polyester", Color.VIOLET, Size.XXL, Fabric.POLYESTER);
    TShirt tShirt6 = new TShirt("Violette-XS-Cashmere", Color.VIOLET, Size.XS, Fabric.CASHMERE);

    TShirt tShirt7 = new TShirt("Indigo-XXXL-Polyester", Color.INDIGO, Size.XXL, Fabric.POLYESTER);
    TShirt tShirt8 = new TShirt("Red-L-Cashmere", Color.RED, Size.L, Fabric.CASHMERE);

    @Before
    public void setUp() {
        tShirts.add(tShirt1);
        tShirts.add(tShirt2);
        tShirts.add(tShirt3);
        tShirts.add(tShirt4);
        tShirts.add(tShirt5);
        tShirts.add(tShirt6);
        tShirts.add(tShirt7);

        sortedTShirtsAsc.add(tShirt6);
        sortedTShirtsAsc.add(tShirt1);
        sortedTShirtsAsc.add(tShirt2);
        sortedTShirtsAsc.add(tShirt3);
        sortedTShirtsAsc.add(tShirt4);
        sortedTShirtsAsc.add(tShirt8);
        sortedTShirtsAsc.add(tShirt7);

        sortedTShirtsDesc.add(tShirt7);
        sortedTShirtsDesc.add(tShirt8);
        sortedTShirtsDesc.add(tShirt4);
        sortedTShirtsDesc.add(tShirt3);
        sortedTShirtsDesc.add(tShirt2);
        sortedTShirtsDesc.add(tShirt1);
        sortedTShirtsDesc.add(tShirt6);

    }

    @Test
    public void BubbleSortTestBySizeColorFabricAsc() {
        bubbleSort.sort(tShirts, bySizeColorFabricAsc);
        Assert.assertArrayEquals(sortedTShirtsAsc.toArray(), tShirts.toArray());

    }

    @Test
    public void BubbleSortTestBySizeColorFabricDesc() {
        bubbleSort.sort(tShirts, bySizeColorFabricDesc);
        List<TShirt> sortedTShirts = new ArrayList<>();
        sortedTShirts.add(tShirt2);
        sortedTShirts.add(tShirt4);
        sortedTShirts.add(tShirt3);
        sortedTShirts.add(tShirt1);
        sortedTShirts.add(tShirt5);
        Assert.assertArrayEquals(sortedTShirtsDesc.toArray(), tShirts.toArray());

    }

    @Test
    public void BucketSortTestBySizeColorFabricAsc() {
        bucketSort.sort(tShirts, bySizeColorFabricAsc);
        Assert.assertArrayEquals(sortedTShirtsAsc.toArray(), tShirts.toArray());

    }

    @Test
    public void BucketSortTestBySizeColorFabricDesc() {
        bucketSort.sort(tShirts, bySizeColorFabricDesc);

        Assert.assertArrayEquals(sortedTShirtsDesc.toArray(), tShirts.toArray());

    }

    @Test
    public void QuickSortTestBySizeColorFabricAsc() {
        quickSort.sort(tShirts, bySizeColorFabricAsc);
        Assert.assertArrayEquals(sortedTShirtsAsc.toArray(), tShirts.toArray());

    }

    @Test
    public void QuickSortTestBySizeColorFabricDesc() {
        quickSort.sort(tShirts, bySizeColorFabricDesc);
        Assert.assertArrayEquals(sortedTShirtsDesc.toArray(), tShirts.toArray());

    }
}
