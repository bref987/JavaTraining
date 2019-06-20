package by.epam.javatraining.slutski.secondmaintask.controller;

/**
 * child class Aerostat from AircraftBaseClass
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class Aerostat extends AircraftBaseClass {

    private int oxygeneCapacity;
    private int oxygeneConsumption;

    Aerostat(String md, int fcp, int fcs, int sp, int ocp, int ocs) {
        super(md, fcp, fcs, sp);
        oxygeneCapacity = ocp;
        oxygeneConsumption = ocs;
    }

    public int getOxygeneCapacity() {
        return oxygeneCapacity;
    }

    void setOxygeneCapacity(int ocp) {
        if (ocp > 0) {
            oxygeneCapacity = ocp;
        }
    }

    public int getOxygeneConsumption() {
        return oxygeneConsumption;
    }

    void setOxygeneConsumption(int ocs) {
        if (ocs > 0) {
            oxygeneConsumption = ocs;
        }
    }
}
