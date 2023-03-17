package Mode;

import java.util.ArrayList;

public class Recipe {

    private ArrayList<Ingredient> recipe;

    public Recipe(){
        recipe = new ArrayList<>();
    }

    public ArrayList<Ingredient> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<Ingredient> recipe) {
        this.recipe = recipe;
    }
}