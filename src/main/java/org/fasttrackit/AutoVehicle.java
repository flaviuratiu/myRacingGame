package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private double mileage;
    private double fuelLevel;
    private Engine engine;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    public AutoVehicle() {
        this(new Engine());
    }

    @Override
    public double accelerate(double speed) {
        double finalSpeed = getCurrentSpeed() + speed;
        setCurrentSpeed(finalSpeed);

        double traveledDistance = finalSpeed / 60;

        double spentFuel = traveledDistance * mileage / 100;

        fuelLevel -= spentFuel;
//        same as
//        fuelLevel = fuelLevel - spentFuel;

        return traveledDistance;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
