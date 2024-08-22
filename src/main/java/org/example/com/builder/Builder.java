package org.example.com.builder;

import org.example.com.model.CookingStep;
import org.example.com.model.Ingredient;

import java.util.List;

public interface Builder {
    void setName(String name);
    void setIngredients(List<Ingredient> ingredients);
    void setSteps(List<CookingStep> steps);


}
