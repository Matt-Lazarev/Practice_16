package ru.mirea.inbo0519.pr16;
import java.util.*;

public class RestaurantOrder implements Order{
    private List<Item> list;

    public RestaurantOrder() {
        this.list = new ArrayList<>();
    }

    public RestaurantOrder(Item ... args){
        list = new ArrayList<>();
        for(int i=0; i< args.length; i++){
            list.add(args[i]);
        }
    }

    @Override
    public void add(Item i){
        list.add(i);
    }

    @Override
    public void delete(String name){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getName() == name){
                list.remove(i);
                return;
            }
        }
    }

    @Override
    public void deleteAll(String name){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getName() == name){
                list.remove(i);
                i--;
            }
        }
    }

    @Override
    public int size(){
        return list.size();
    }

    @Override
    public Item[] allDishes(){
        Item[] temp = new Item[list.size()];
        temp = list.toArray(temp);
        return temp;
    }

    @Override
    public int finalCost(){
        int cost = 0;
        for(int i=0; i<list.size(); i++){
            cost+=list.get(i).getCost();
        }
        return cost;
    }

    @Override
    public int countOfDishes(String name){
        int count = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getName() == name){
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] NamesOfDishes()
    {
        String[] names = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            names[i] = list.get(i).getName();
        }
        return names;
    }

    @Override
    public List<Item> sortedByCost(){
        List<Item> temp = new ArrayList<>(list);
        temp.sort(((o1, o2) -> o1.getCost()-o2.getCost()));
        return temp;
    }
}
