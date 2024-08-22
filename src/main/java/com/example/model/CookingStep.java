package com.example.model;

public class CookingStep {
    private String description;
    private int duration;

    public CookingStep(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "CookingStep --> " +
                "description='" + description + '\'' +
                ", duration=" + duration;
    }
}
