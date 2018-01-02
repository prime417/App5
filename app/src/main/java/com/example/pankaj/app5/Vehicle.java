package com.example.pankaj.app5;

import java.util.Locale;

/**
 * Created by Pankaj on 28-12-2017.
 */

public class Vehicle {

    private int speed;
    private int numberOfWheels;
    private final boolean HASBREAKINGSYSTEM;
    private int rideSpeed ;

    public Vehicle(int speed, boolean hasBreakingSystem, int numberOfWheels){
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.HASBREAKINGSYSTEM = hasBreakingSystem;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean getHASBREAKINGSYSTEM() {
        return HASBREAKINGSYSTEM;
    }

    public int getRideSpeed() {
        return rideSpeed;
    }

    public void ride(){
        int result = getNumberOfWheels() * getSpeed();
      rideSpeed = result;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s: %d %s: %b %s: %d %s: %d", "Speed", getSpeed(), "Breaking System", getHASBREAKINGSYSTEM(), "Number of Wheels", getNumberOfWheels()
        , "Ride Speed", getRideSpeed());
    }
}
