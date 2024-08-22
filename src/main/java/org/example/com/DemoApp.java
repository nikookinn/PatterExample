package org.example.com;


import org.example.com.builder.RecipeBuilder;
import org.example.com.factory.Factory;
import org.example.com.factory.PizzaFactory;
import org.example.com.model.Recipe;
import org.example.com.util.PrintRecipe;

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
