package ex3;

import ex3.utils.AnimalType;
import ex3.utils.FoodType;
import ex3.zones.Zone;

import java.util.ArrayList;

public class Zoo {

	/** Usage : THe name of the zoo
	 *   String : nom
	 */
	private String nom;

	/** Usage : The list of all zones in the zoo
	 *   ArrayList<Zone> : zones
	 */
	private ArrayList<Zone> zones;

	/** Constructor for Zoo
	 *  @param nom the name of the zoo
	 */
	public Zoo(String nom){
		this.nom = nom;
		zones = new ArrayList<Zone>();
		initZoo();
	}

	/** Init the zoo with built in zones */
	private void initZoo(){
		zones.add(new Zone("Aquarium", 0.2f, AnimalType.FISH, FoodType.HERBIVORE ));
		zones.add(new Zone("Ferme au reptiles", 0.1f, AnimalType.REPTILE, FoodType.CARNIVORE ));
		zones.add(new Zone("Savane affricaine", 10f, AnimalType.MAMAL, FoodType.HERBIVORE));
		zones.add(new Zone("Carnivores", 10f, AnimalType.MAMAL, FoodType.CARNIVORE));
	}

	/** Add an animal to the zoo if an apropriate zone is found
	 * @param animalToAdd
	 */
	public void addAnimal(Animal animalToAdd){

		for(Zone z : zones){
			if(z.correctHabitat(animalToAdd)){
				z.addAnimal(animalToAdd);
				break;
			}
		}

	}

	/** Print the list of all animals sorted by zones */
	public void printAllAnimals(){
		for(Zone z : zones){
			System.out.println(z);
		}
	}



	//==============================================================//
	//************************Getters/Setters***********************//
	//==============================================================//


	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
