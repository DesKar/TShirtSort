package tshirtsort;

import java.util.List;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.BubbleSort;
import tshirtsort.sorting.QuickSort;

public class MainClass {

    public static void main(String[] args) {
        TShirtFactory tFactory = new TShirtFactory();
        List<TShirt> shirts = tFactory.TShirtGenerateN(3);
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        // BucketSort bus = new BucketSort();

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
        quickSort(qs, shirts, true, 1); // Size ASC
        quickSort(qs, shirts, false, 1); // Size DESC

        quickSort(qs, shirts, true, 2); // Color ASC
        quickSort(qs, shirts, false, 2); // Color DESC

        quickSort(qs, shirts, true, 3); // Fabric ASC
        quickSort(qs, shirts, false, 3); // Fabric DESC

    }

    public static void quickSort(QuickSort qs, List<TShirt> shirts, boolean sortType, int sortByProperty) {
        System.out.println("/// --------- ///");
        long startTime = 0;
        long endTime = 0;
        switch (sortByProperty) {
            // Size - 1
            case 1:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 1);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Size ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Size DESC: " + (endTime - startTime));
                }
                break;
            // Color - 2
            case 2:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 2);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Color ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Color DESC: " + (endTime - startTime));
                }
                break;
            // Fabric - 3
            case 3:
                startTime = System.currentTimeMillis();
                qs.sort(shirts, 0, shirts.size() - 1, sortType, 3);
                endTime = System.currentTimeMillis();

                if (sortType) {
                    System.out.println("Time Lapsed for QS by Fabric ASC: " + (endTime - startTime));
                } else {
                    System.out.println("Time Lapsed for QS by Fabric DESC: " + (endTime - startTime));
                }
                break;
        }

        for (TShirt shirt : shirts) {
            System.out.println(shirt);
        }
    }

    // bubleSort
    // bucketSort
}
