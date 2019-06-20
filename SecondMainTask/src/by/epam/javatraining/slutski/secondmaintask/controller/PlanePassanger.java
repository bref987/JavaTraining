package by.epam.javatraining.slutski.secondmaintask.controller;

import by.epam.javatraining.slutski.secondmaintask.controller.AircraftBaseClass;

/**
 * child class PlanPassanger from AircraftBaseClass
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class PlanePassanger extends AircraftBaseClass{
    
    private int passangerCapacity;
    
    PlanePassanger(String md, int fcp, int fcs, int sp, int pp) {
        super(md, fcp, fcs, sp);
        passangerCapacity = pp; 
    }
    
    public int getPassangerCapacity() {
        return passangerCapacity;
    }
    void setPassangerCapacity(int pp) {
        passangerCapacity = pp;
    }
}
