package Mode;

import java.util.ArrayList;

public class Ingredient {

    //private ArrayList<Ingredient> food = new ArrayList<>;

    private String ingredient;
    private int weight;

    public Ingredient(String ingredient,int weight){
        this.ingredient=ingredient;
        this.weight=weight;
    }
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
