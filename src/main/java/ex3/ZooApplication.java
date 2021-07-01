package ex3;

import ex3.utils.AnimalType;
import ex3.utils.FoodType;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Zèbre", AnimalType.MAMAL, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", AnimalType.MAMAL, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", AnimalType.MAMAL, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", AnimalType.FISH, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", AnimalType.FISH, FoodType.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", AnimalType.REPTILE, FoodType.CARNIVORE));
		zoo.addAnimal(new Animal("Python", AnimalType.REPTILE, FoodType.CARNIVORE));

		zoo.printAllAnimals();
	}

}
