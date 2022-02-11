package com.alain.inheritance;

public class Car extends Vehicle{
    //TODO Create your instance variable here
    private int numDoors;

    //TODO Create your constructor here
        public Car(int speed, String colorSelection, String makeSelection, String modelSelection, boolean isElectric, int numDoors) {
        super(speed, colorSelection, makeSelection, modelSelection, isElectric );
        this.numDoors = numDoors;
    }

    //TODO Create your getter and setter here
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    //TODO Create a toString() method here to print out the values of instances of Car
}
