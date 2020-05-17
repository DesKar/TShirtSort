package tshirtsort;

import java.util.List;
import tshirtsort.factories.SortingAlgorithmFactory;
import tshirtsort.factories.SortingStrategyFactory;
import tshirtsort.factories.TShirtFactory;
import tshirtsort.models.TShirt;
import tshirtsort.sorting.algorithms.ISortingAlgorithm;
import tshirtsort.sorting.strategies.ISortingStrategy;

public class MainClass {

    public static void main(String[] args) {
        TShirtFactory tFactory = new TShirtFactory();
        List<TShirt> tShirts = tFactory.TShirtGenerateN(10000);

        SortingAlgorithmFactory algoFactory = new SortingAlgorithmFactory();
        List<ISortingAlgorithm> sortingAlgorithms = algoFactory.generateSortingAlgorithms();

        SortingStrategyFactory strategyFactory = new SortingStrategyFactory();
        List<ISortingStrategy> sortingStrategies = strategyFactory.generateSortingStrategies();

        for (ISortingAlgorithm sortingAlgorithm : sortingAlgorithms) {
            for (ISortingStrategy sortingStrategy : sortingStrategies) {
                long startTime = System.currentTimeMillis();
                sortingAlgorithm.sort(tShirts, sortingStrategy);
                long endTime = System.currentTimeMillis();
                System.out.println("Sorting Algorithm: " + sortingAlgorithm.toString());
                System.out.println("Sorting Strategy: " + sortingStrategy.toString());
                System.out.println("Lapsed time: " + (endTime - startTime));
                System.out.println("-----------------------------------------");
            }

        }
    }
}
