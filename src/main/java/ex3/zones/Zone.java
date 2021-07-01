package ex3.zones;

import ex3.Animal;
import ex3.utils.AnimalType;
import ex3.utils.FoodType;
import ex3.utils.Habitat;

import java.util.ArrayList;

public class Zone {
    /** Usage : The list of all animals in the zone
     *   ArrayList<Animal> : animals
     */
    private ArrayList<Animal> animals;

    /** Usage : The name of the zone
     *   String : name
     */
    private String name;

    /** Usage : The food multiplier
     *   float : foodPerDay
     */
    private float foodPerDay;

    /** Usage : The default habitat of the zone
     *   PreferedHabitat : zoneInhabitants
     */
    private Habitat zoneInhabitants;

    /** Constructor for Zone
     *  @param zoneName The name of the zone
     *  @param foodConsumption The food consumption rate of the zone
     *  @param fam The family of animal allowed in this zone
     *  @param food The food habit of animals allowed in this zone
     */
    public Zone(String zoneName, float foodConsumption, AnimalType fam, FoodType food){
        animals = new ArrayList<Animal>();
        name = zoneName;
        foodPerDay = foodConsumption;
        zoneInhabitants = new Habitat(fam, food);
    }

    /** Add an animal to the zone
     * @param animalToAdd The animal to add
     */
    public void addAnimal(Animal animalToAdd){
        animals.add(animalToAdd);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     * Replace afficherListeAnimaux()
     */
    public String toString(){
        String temp = "Animal(s) in " + name + " :\n";

        for(Animal a : animals){
            temp += a + "\n";
        }

        return temp;
    }

    /** Count the number of animal in the zone
     * @return The number of animals in the zone
     */
    public int compterAnimaux(){
        return animals.size();
    }

    /** Calculate the food consumption of the zone
     * @return The food to consume
     */
    public double calculerKgsNourritureParJour(){
        return compterAnimaux() * foodPerDay;
    }

    /** Check if the animal can live in this zone
     * @param animalToAdd The animal to check
     * @return True if the animal can be added, false otherwise.
     */
    public boolean correctHabitat(Animal animalToAdd){

        if(animalToAdd.getHabitat().equals(zoneInhabitants)){
            return true;
        }

        return false;
    }
}
