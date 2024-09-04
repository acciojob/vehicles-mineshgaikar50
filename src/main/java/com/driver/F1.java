package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Use arbitrary values for parameters that are not mentioned
        super(name, 4, 2, 6, isManual, "F1", 1);
        // name, wheels, doors, gears, isManual, type, seats
    }

    public void accelerate(int rate) {
        int currentSpeed = getCurrentSpeed(); // Assuming getCurrentSpeed() is available in the Vehicle or Car class
        int newSpeed = currentSpeed + rate;   // Calculate the new speed based on current speed and rate

        // Determine the gear based on the new speed
        if (newSpeed == 0) {
            stop();  // Assuming stop() method exists to stop the car
            changeGear(1); // Set gear to 1
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed > 50 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed > 100 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed > 150 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed > 200 && newSpeed <= 250) {
            changeGear(5);
        } else if (newSpeed > 250) {
            changeGear(6);
        }

        // If the new speed is greater than 0, change the speed and direction
        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());  // Assuming getCurrentDirection() is available in the Vehicle or Car class
        }
    }
}
