package com.example.bpfp;


import com.example.bpfp.util.PrintRecipe;
import com.example.bpfp.builder.RecipeBuilder;
import com.example.bpfp.factory.Factory;
import com.example.bpfp.factory.PizzaFactory;
import com.example.bpfp.model.Recipe;

public class DemoApp {

    public static void main(String[] args) {
        //MealBuilder builder = new MealBuilder();
        //Director director = new Director();
        //director.createBurgerMeal(builder);
        //Meal meal = builder.getResult();

        //System.out.println(meal.getSteps());
        //System.out.println(meal);


        Factory factory = new PizzaFactory();
        RecipeBuilder builder = new RecipeBuilder();
        factory.create(builder);
        Recipe recipe = builder.getResult();
        PrintRecipe.print(recipe);

        System.out.println();
        System.out.println(recipe.getPrice());
    }
}
