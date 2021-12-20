package ru.mirea.task27.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestCity {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Petersburg", "Russia"));
        cities.add(new City("Moscow", "Russia"));
        cities.add(new City("Washington", "USA"));
        cities.add(new City("Delhi", "India"));
        cities.add(new City("London", "UK"));
        cities.add(new City("Barcelona", "Spain"));
        cities.add(new City("New York", "USA"));
        cities.add(new City("Kiev", "Ukraine"));

        Map<String, ArrayList<String>> dict = new HashMap<>();
        for (City city : cities){
            if (dict.keySet().contains(city.country)){
                dict.get(city.country).add(city.name);
            } else {
                dict.put(city.country, new ArrayList<String>());
                dict.get(city.country).add(city.name);
            }
        }
        System.out.println(dict);
    }
}
