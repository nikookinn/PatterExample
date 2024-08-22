package com.example;


import com.example.builder.RecipeBuilder;
import com.example.factory.Factory;
import com.example.factory.PizzaFactory;
import com.example.model.Recipe;
import com.example.util.PrintRecipe;

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
