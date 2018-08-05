public class Wolf extends Animal {

    public Wolf() {
    }

    public Wolf(String name, int actualWeight) {
        this.name = name;
        this.actualWeight = actualWeight;
        this.overweightLimit = 6;
        weightFactor.put(Food.MEAT, +3);
        weightFactor.put(Food.VEGETABLE, -1);
        weightFactor.put(Food.FRUIT, -1);
    }
}
