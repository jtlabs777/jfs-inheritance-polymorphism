package com.alain.inheritance;

public class Moto extends Vehicle {
   ;
    //TODO Create your instance field here
    private int numOfseats;

    //TODO Create your contructor here

    public Moto(int speed, String colorSelection, String makeSelection, String modelSelection, boolean isElectric, int numOfseats) {
        super(speed, colorSelection, makeSelection, modelSelection, isElectric);
        this.numOfseats = numOfseats;
    }


    //TODO Create your getter and setter here
    public int getNumOfseats() {
        return numOfseats;
    }

    public void setNumOfseats(int numOfseats) {
        this.numOfseats = numOfseats;
    }


    //TODO Create your increaseSpeed method here
    @Override
    public void increaseSpeed() {
        System.out.println("Increase speed: " + this.getMake() + " " + this.getModel());
        if (this.currentSpeed <= this.topSpeed - 20) {
            this.currentSpeed += 20;
        } else {
            System.out.println("This cannot go above " + this.topSpeed);
        }
    }

}
