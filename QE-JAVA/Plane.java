package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {

    
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
        } else {
            System.out.println("Plane is full!");
        }
    }

    
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }

    
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    
    public List<String> getPassengers() {
        return passengers;
    }
}