package com.alain.inheritance;



public class Vehicle {
    protected int topSpeed;
    //TODO  Add other instance variables here
    protected int currentSpeed = 0;
    private String color;
    private String make;
    private String model;
    private boolean isElectric;

    //TODO Create your constructor here
    public Vehicle (int speed, String colorSelection, String makeSelection, String modelSelection, boolean isElectric) {
        this.topSpeed = speed;
        this.color = colorSelection;
        this.make = makeSelection;
        this.model = modelSelection;
        this.isElectric = isElectric;
    }


    //TODO Create your getters
    public int getTopSpeed() {
        return topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean getIsElectric() {
        return isElectric;
    }



// TODO Create your setters

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //TODO Create your increaseSpeed() method here

    public void increaseSpeed() {
        System.out.println("Increase speed: " + this.make + " " + this.model);
        if (this.currentSpeed <= this.topSpeed - 10) {
            this.currentSpeed += 10;
        }
    }




    //TODO Create your decreaseSpeed() method here
    public void decreaseSpeed() {
        System.out.println("Decreasing speed of " + this.make + " model " + this.model + " by 10");
        if (this.currentSpeed > 10) {
            this.currentSpeed -= 10;
        } else {
            System.out.println("Decrease speed from " + this.currentSpeed + " to 0");
            this.currentSpeed -= currentSpeed;
        }

    }



    //TODO Create a toString() method here to print the values of your objects



}
