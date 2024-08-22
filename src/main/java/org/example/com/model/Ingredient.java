package org.example.com.model;

public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private double unitPrice;

    public Ingredient(String name, double quantity, String unit, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }


    public double getQuantity() {
        return quantity;
    }


    public String getUnit() {
        return unit;
    }


    public double getUnitPrice() {
        return unitPrice;
    }


    @Override
    public String toString() {
        return "Ingredients --> " +
                "name = '" + name + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", unitPrice=" + unitPrice;
    }
}
