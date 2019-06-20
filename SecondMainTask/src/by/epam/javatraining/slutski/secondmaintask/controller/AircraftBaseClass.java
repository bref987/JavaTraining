package by.epam.javatraining.slutski.secondmaintask.controller;

/**
 * parent class Aircraft
 *
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class AircraftBaseClass {

    private String model;
    private int fuelCapacity;
    private int fuelConsumption;
    private int speed;

    AircraftBaseClass(String mod, int fcp, int fcs, int sp) {
        model = mod;
        fuelCapacity = fcp;
        fuelConsumption = fcs;
        speed = sp;
    }

    public String getModel() {
        return model;
    }

    void setModel(String mod) {
        model = mod;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    void setFuelCapacity(int fcp) {
        if (fcp > 0) {
            fuelCapacity = fcp;
        }
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    void setFuelConsumption(int fcs) {
        if (fcs > 0) {
            fuelConsumption = fcs;
        }
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int sp) {
        if (sp > 0) {
            speed = sp;
        }
    }

    public int maxDistance() {
        return fuelCapacity / fuelConsumption;
    }
}
