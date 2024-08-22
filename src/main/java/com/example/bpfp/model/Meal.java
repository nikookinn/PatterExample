package com.example.bpfp.model;

import java.util.List;

public class Meal {
    private final String name;
    private final Double price;
    private final List<Ingredient> ingredients;
    private final List<CookingStep> steps;

    public List<CookingStep> getSteps() {
        return steps;
    }

    public Meal(String name, Double price, List<Ingredient> ingredients, List<CookingStep> steps) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                ", steps=" + steps +
                '}';
    }
}
