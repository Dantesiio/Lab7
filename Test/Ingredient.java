package Mode;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class test{
    private Recipe recipe;
    @BeforeEach
    void setUp1(){
        recipe= new Recipe();
    }
    @Test
    void IngredientTest(){
        setUp1();
        recipe.setRecipe(new Ingredient("Tomate",245));
    }

}



