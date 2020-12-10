package ru.mirea.inbo0519.pr16;

import java.util.*;

public interface Order {

    void add(Item i);

    void delete(String name);

    void deleteAll(String name);

    int size();

    Item[] allDishes();

    int finalCost();

    int countOfDishes(String name);

    String[] NamesOfDishes();

    List<Item> sortedByCost();


}
