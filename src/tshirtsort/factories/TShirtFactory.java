package tshirtsort.factories;

import java.util.ArrayList;
import java.util.List;
import tshirtsort.models.TShirt;
import tshirtsort.randomizer.RandomTShirt;


public class TShirtFactory {
    
    public List<TShirt> TShirtGenerateN(int n) {
        RandomTShirt rt = new RandomTShirt();
        List<TShirt> listOfTShirts = new ArrayList<>();
                
        for (int i = 0; i < n; i++) {
            listOfTShirts.add(rt.generate());
        }
        return(listOfTShirts);
    }
    
}
