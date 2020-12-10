package ru.mirea.inbo0519.pr16;

public final class Dish implements Item{
    private final int cost;
    private final String name;
    private final String description;

    public Dish(int cost, String name, String description){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
