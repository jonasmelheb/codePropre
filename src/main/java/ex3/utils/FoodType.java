package ex3.utils;

public enum FoodType {
    HERBIVORE ("Herbivore"),
    CARNIVORE("Carnivore");

    private String foodType;

    FoodType(String s) {
        foodType = s;
    }

    public String getFoodName(){
        return foodType;
    }
}
