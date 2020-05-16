package tshirtsort.randomizer;

import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;

public class RandomAttribute {

    public String getRandomName() {
        int leftLimit = 'a';
        int rightLimit = 'z';
        int targetStringLength = 10;
        java.util.Random random = new java.util.Random();

        String name = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return (name);
    }
    
    public Color getRandomColor() {
        Color[] colors = Color.values();
        Color color = colors[getRandomNumberInRange(0, colors.length)];
        return color;
    }

    public Size getRandomSize() {
        Size[] sizes = Size.values();
        Size size = sizes[getRandomNumberInRange(0, sizes.length)];
        return size;
    }

    public Fabric getRandomFabric() {
        Fabric [] fabrics = Fabric.values();
        Fabric fabric = fabrics[getRandomNumberInRange(0, fabrics.length)];
        return fabric;
    }

    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Max must be greater than min.");
        }

        java.util.Random r = new java.util.Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
