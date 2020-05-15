package tshirtsort.randomizer;

import tshirtsort.models.Color;
import tshirtsort.models.Fabric;
import tshirtsort.models.Size;

public class RandomGenerator {

    public String getRandomName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        java.util.Random random = new java.util.Random();

        String name = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return (name);
    }

    public Color getRandomColor() {
        Color color = Color.values()[getRandomNumberInRange(0, 6)];
        return color;
    }

    public Size getRandomSize() {
        Size size = Size.values()[getRandomNumberInRange(0, 6)];
        return size;
    }

    public Fabric getRandomFabric() {
        Fabric fabric = Fabric.values()[getRandomNumberInRange(0, 6)];
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
