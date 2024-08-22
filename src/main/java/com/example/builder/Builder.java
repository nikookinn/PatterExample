package com.example.builder;

import com.example.model.CookingStep;
import com.example.model.Ingredient;

import java.util.List;

public interface Builder {
    void setName(String name);
    void setIngredients(List<Ingredient> ingredients);
    void setSteps(List<CookingStep> steps);


}
