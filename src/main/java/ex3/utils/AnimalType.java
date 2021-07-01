package ex3.utils;

public enum AnimalType {
    MAMAL ("Mamifère"),
    FISH("Poisson"),
    REPTILE("Reptile");

    private String animalType;

    AnimalType(String s) {
        animalType = s;
    }

    public String getAnimalType(){
        return animalType;
    }
}
