public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(String name, int actualWeight) {
        this.name = name;
        this.actualWeight = actualWeight;
        this.overweightLimit = 4;
        weightFactor.put(Food.MEAT, -1);
        weightFactor.put(Food.VEGETABLE, +2);
        weightFactor.put(Food.FRUIT, +1);
    }
}
