package day05;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int capacity;
    private List<Passenger> passengers;

    public Plane(int capacity) {
        this.capacity = capacity;
        passengers = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < capacity) {
            return passengers.add(passenger);
        }
        return false;
    }

    public int numberOfPackages() {
        int numberOfPackages = 0;

        for (Passenger passenger : passengers) {
            numberOfPackages += passenger.getLuggage();
        }
        return numberOfPackages;
    }
}