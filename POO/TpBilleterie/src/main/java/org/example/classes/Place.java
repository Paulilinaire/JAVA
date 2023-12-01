package org.example.classes;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Data
public class Place {
    private static int counter = 1;

    private int id;
    private String name;
    private String address;
    private int capacity;

    @Getter
    public ArrayList<Place> allPlaces = new ArrayList<>();

    public Place(String name, String address, int capacity) {
        this.id = counter++;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        allPlaces.add(this);
    }

    private Place findPlace(int id){
        Place place = null;
        for (Place p: allPlaces) {
            if(p.getId() == id){
                place = p;
                break;
            }
        }
        return place;
    }

    public boolean addPlace(String name, String address, int capacity) {
        Place newPlace = new Place(name, address, capacity);
        return allPlaces.add(newPlace);
    }

    public boolean deletePlace(int id){
        Place place = findPlace(id);
        if(place != null){
            return allPlaces.remove(place);
        }
        return false;
    }

    public boolean changePlace(int id, String newName, String newAddress, int newCapacity) {
        Place place = findPlace(id);
        if (place != null) {
            place.setName(newName);
            place.setAddress(newAddress);
            place.setCapacity(newCapacity);
            return true;
        }
        return false;
    }





}
