package tshirtsort.randomizer;

import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;
import tshirtsort.models.TShirt;

public class RandomTShirt {

    public TShirt generate() {
        RandomGenerator r = new RandomGenerator();
        Color color = r.getRandomColor();
        Size size = r.getRandomSize();
        Fabric fabric = r.getRandomFabric();

        TShirt t = new TShirt(r.getRandomName(), color, size, fabric);
        return (t);
    }

}
