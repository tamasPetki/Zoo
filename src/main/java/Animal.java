import java.util.HashMap;

abstract class Animal {

    int overweightLimit;
    int actualWeight;
    String name;
    HashMap<Food, Integer> weightFactor = new HashMap<Food, Integer>();

    public boolean checkIfDied() {
        if(actualWeight >= overweightLimit || actualWeight <=0) {
            return true;
        }
        return false;
    }

    public int getOverweightLimit() {
        return overweightLimit;
    }

    public int getActualWeight() {
        return actualWeight;
    }

    public void setActualWeight(int actualWeight) {
        this.actualWeight = actualWeight;
    }

    public String getName() {
        return name;
    }

    public void eat(Food foodtype) {
        switch (foodtype) {
            case MEAT:
                setActualWeight(getActualWeight() + weightFactor.get(Food.MEAT));
                break;
            case VEGETABLE:
                setActualWeight(getActualWeight() + weightFactor.get(Food.VEGETABLE));
                break;
            case FRUIT:
                setActualWeight(getActualWeight() + weightFactor.get(Food.FRUIT));
                break;
        }
    }

    @Override
    public String toString() {
        return "NAME: "+ getName() + "\n" + "ACTUAL WEIGHT: " + getActualWeight() + "\n" + "OVERWEIGHT: " + getOverweightLimit() + "\n";
    }
}
