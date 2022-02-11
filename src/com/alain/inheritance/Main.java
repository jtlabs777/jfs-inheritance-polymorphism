package com.alain.inheritance;

public class Main {
    public static void main(String[] args) {

        //TODO Create an instance of your Car class and name it carOne. Pass in the appropriate arguments
         Car carOne = new Car(90, "red","Toyota", "Prius", true, 4);

        //TODO Create an instance of your Moto class and name it motoOne. Pass in the appropriate arguments
        Moto motoOne = new Moto(30, "silver", "Tesla", "S", true, 4);

        //TODO Call increaseSpeed() on carOne.
        carOne.increaseSpeed();
        carOne.increaseSpeed();

        //TODO Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)
        System.out.println(carOne.getCurrentSpeed());

        //TODO Call decreaseSpeed() on carOne.
        carOne.decreaseSpeed();

        //TODO Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)
        System.out.println(carOne.getCurrentSpeed());

        //TODO Call increaseSpeed() on motoOne.
        motoOne.increaseSpeed();
        motoOne.increaseSpeed();
        motoOne.increaseSpeed();
        motoOne.increaseSpeed();

        //TODO Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)
        System.out.println(motoOne.getCurrentSpeed());

        //TODO Call decreaseSpeed() on motoOne.
        motoOne.decreaseSpeed();

        //TODO Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)
        System.out.println(motoOne.getCurrentSpeed());

        //TODO Try to increase the speed of motoOne above it's max speed. This should not be allowed.
        motoOne.increaseSpeed();

        //TODO Try to decrease the speed of motoOne below 0. This should not be allowed.
        motoOne.decreaseSpeed();
        motoOne.decreaseSpeed();
        motoOne.decreaseSpeed();
        motoOne.decreaseSpeed();
        motoOne.decreaseSpeed();

    }
}
