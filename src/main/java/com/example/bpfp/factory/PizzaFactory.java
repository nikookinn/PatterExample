package com.example.factory;

import com.example.builder.Builder;
import com.example.model.CookingStep;
import com.example.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class PizzaFactory implements Factory {
    @Override
    public void create(Builder builder) {
        builder.setName("Pizza");
        List<Ingredient> ingredients = List.of( new Ingredient("Pizza dough",200,"gram",0.003),
                new Ingredient("chicken",200,"gram",0.01),
                new Ingredient("mushroom",100,"gram",0.01),
                new Ingredient("mozzarella cheese",1,"piece",0.5));

        builder.setIngredients(new ArrayList<>(ingredients));

        List<CookingStep> cookingSteps = List.of(new CookingStep("First of all you have to cut the bread",2),
                new CookingStep("Cook the chicken on the pan",5),
                new CookingStep("Cut a slice of mozzarella cheese for burger",3),
                new CookingStep("Put everything inside the bread slice respectively",5));
        builder.setSteps(cookingSteps);
    }
}
