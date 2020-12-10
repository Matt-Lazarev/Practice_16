package ru.mirea.inbo0519.pr16;

import java.util.*;

public class OrderManager {
    private Map<String, Order> map = new HashMap<>();

    public void add(String address, Order order){
        map.put(address, order);
    }

    public Order getOrder(String name){
        return map.get(name);
    }

    public void delete(String name){
        map.remove(name);
    }

    public int countOfInternetOrders(){
        int count = 0;
        List<Map.Entry<String, Order>> list = new ArrayList<>(map.entrySet());
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getValue() instanceof InternetOrder){
                count ++;
            }
        }
        return count;
    }

    public InternetOrder[] ArrayOfInternetOrders(){
        InternetOrder[] arr = new InternetOrder[map.size()];
        int size = 0;
        List<Map.Entry<String, Order>> list = new ArrayList<>(map.entrySet());
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getValue() instanceof InternetOrder){
                arr[size++] = (InternetOrder)list.get(i).getValue();
            }
        }
        return arr;
    }

    public int countOfInternetOrders(String name){
        int count = 0;
        List<Map.Entry<String, Order>> list = new ArrayList<>(map.entrySet());
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getValue() instanceof InternetOrder && list.get(i).getKey().equalsIgnoreCase(name)){
                count ++;
            }
        }
        return count;
    }
}
