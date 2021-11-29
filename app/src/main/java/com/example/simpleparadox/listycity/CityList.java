package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This delete a city from the list if the city list exists
     * @param city
     *      This is a candidate city to delete
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException();
        }
    }


    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This function returns the size of the list
     * @return
     *      Return the list.size
     */
    public int getSize(){
        List<City> list = cities;
        return list.size();
    }

}
