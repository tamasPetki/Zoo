public class Bear extends Animal {

    public Bear() {
    }

    public Bear(String name, int actualWeight) {
        this.name = name;
        this.actualWeight = actualWeight;
        this.overweightLimit = 10;
        weightFactor.put(Food.MEAT, +1);
        weightFactor.put(Food.VEGETABLE, -1);
        weightFactor.put(Food.FRUIT, +1);
    }
}
