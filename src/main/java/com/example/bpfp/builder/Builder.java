
package com.example.bpfp.builder;

import com.example.bpfp.model.CookingStep;
import com.example.bpfp.model.Ingredient;

import java.util.List;

public interface Builder {
    void setName(String name);
    void setIngredients(List<Ingredient> ingredients);
    void setSteps(List<CookingStep> steps);


}
