package ex3.utils;

public class Habitat {
    /** Usage : The animal classification of the habitat
     *   AnimalClass : family
     */
    private AnimalType family;

    /** Usage : The prefered food of animals in this habitat
     *   FoodType : preferedFood
     */
    private FoodType preferedFood;

    public Habitat(AnimalType fam, FoodType food){
        family = fam;
        preferedFood = food;
    }

    public boolean equals(Object object){

        if(object instanceof Habitat){
            Habitat temp = (Habitat)object;
            if ((temp.getAnimalType().equals(this.getAnimalType())) && (temp.getFoodType().equals(this.getFoodType()))){
                return true;
            }
        }

        return false;
    }

    public String getAnimalType(){
        return family.getAnimalType();
    }

    public String getFoodType(){
        return preferedFood.getFoodName();
    }
}
