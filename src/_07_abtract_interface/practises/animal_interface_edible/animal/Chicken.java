package _07_abtract_interface.practises.animal_interface_edible.animal;

import _07_abtract_interface.practises.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken , cluck cluck cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
