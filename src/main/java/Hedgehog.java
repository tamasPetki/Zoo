public class Hedgehog extends Animal {

    public Hedgehog() {
    }

    public Hedgehog(String name, int actualWeight) {
        this.name = name;
        this.actualWeight = actualWeight;
        this.overweightLimit = 5;
        weightFactor.put(Food.MEAT, -1);
        weightFactor.put(Food.VEGETABLE, 0);
        weightFactor.put(Food.FRUIT, +2);
    }
}
