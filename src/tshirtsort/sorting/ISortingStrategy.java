package tshirtsort.sorting;

import tshirtsort.models.TShirt;


public interface ISortingStrategy {
    
     /**
      * Compares two TShirts according to the sorting strategy. 
      * @param t1 TShirt 1
      * @param t2 TShirt 2
      * @returns 
      */
    int compare(TShirt t1, TShirt t2);
    
}
