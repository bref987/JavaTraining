package by.epam.javatraining.slutski.secondmaintask.controller;

import by.epam.javatraining.slutski.secondmaintask.controller.PlanePassanger;

/**
 * child class PlanePassanger from PlanePassanger
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class Airship extends PlanePassanger {

    private int heliumCapacity;

    Airship(String md, int fcp, int fcs, int sp, int pp, int hc) {
        super(md, fcp, fcs, sp, pp);
        heliumCapacity = hc;
    }

    public int getHeliumCapacity() {
        return heliumCapacity;
    }

    void setHeliumCapacity(int hc) {
        heliumCapacity = hc;
    }
}
