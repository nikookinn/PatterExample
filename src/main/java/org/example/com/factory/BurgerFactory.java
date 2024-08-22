package org.example.com.factory;

import org.example.com.builder.Builder;
import org.example.com.model.CookingStep;
import org.example.com.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class BurgerFactory implements Factory {
    @Override
    public void create(Builder builder) {
        builder.setName("Burger");
        List<Ingredient> ingredients = List.of( new Ingredient("bread",2,"slice",0.2),
                new Ingredient("meet",100,"gram",0.015),
                new Ingredient("mozzarella cheese",1,"piece",0.4));

        builder.setIngredients(new ArrayList<>(ingredients));

        List<CookingStep> cookingSteps = List.of(new CookingStep("First of all you have to cut the bread",1),
                new CookingStep("Cook the meet on the pan",5),
                new CookingStep("Cut a slice of mozzarella cheese for burger",1),
                new CookingStep("Put everything inside the bread slice respectively",2));
        builder.setSteps(cookingSteps);
    }
}
