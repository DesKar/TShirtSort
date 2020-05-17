package tshirtsort.sortingstrategies;

import tshirtsort.models.TShirt;

public interface ISortingStrategy {

    int compare(TShirt t1, TShirt t2);

    int computeNrOfBuckets();

    int getBucket(TShirt tShirt);

}
