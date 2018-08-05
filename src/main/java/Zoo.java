import java.util.ArrayList;
import java.util.List;

public class Zoo {

    static List<Animal> animals = new ArrayList<Animal>();
    static List<Food> foodDays = new ArrayList<>();

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.init();
        for(Food day: foodDays) {
            System.out.println(day + " day is today\n");
            for (Animal animal : animals) {
                animal.eat(day);
                System.out.println(animal.toString());
                if(animal.checkIfDied()) System.out.println(animal.getName() + " DIED!" + "\n");
            }
            animals.removeIf(Animal::checkIfDied);
        }
    }

    void init() {
        animals.add(new Wolf("Akela", 3));
        animals.add(new Bear("Balu", 4));
        animals.add(new Rabbit("Tapsi", 2));
        animals.add(new Bear("Brumi", 6));
        animals.add(new Hedgehog("Durum", 4));

        foodDays.add(Food.MEAT);
        foodDays.add(Food.FRUIT);
        foodDays.add(Food.MEAT);
        foodDays.add(Food.VEGETABLE);
        foodDays.add(Food.MEAT);
    }
}
