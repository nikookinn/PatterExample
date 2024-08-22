package com.example.bpfp.factory;

import com.example.bpfp.builder.Builder;
import com.example.bpfp.model.CookingStep;
import com.example.bpfp.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class SandwichFactory implements Factory {
    @Override
    public void create(Builder builder) {
        builder.setName("Sandwich");
        List<Ingredient> ingredients = List.of( new Ingredient("sandwich bread",4,"slice",0.3),
                new Ingredient("chicken",100,"gram",0.01),
                new Ingredient("mozzarella cheese",1,"piece",0.5));

        builder.setIngredients(new ArrayList<>(ingredients));

        List<CookingStep> cookingSteps = List.of(new CookingStep("First of all you have to cut the bread",2),
                new CookingStep("Cook the chicken on the pan",5),
                new CookingStep("Cut a since of mozzarella cheese for burger",3),
                new CookingStep("Put everything inside the bread slice respectively",5));
        builder.setSteps(cookingSteps);
    }
}
