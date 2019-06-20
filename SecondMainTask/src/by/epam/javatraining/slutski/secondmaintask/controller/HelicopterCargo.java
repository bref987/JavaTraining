package by.epam.javatraining.slutski.secondmaintask.controller;

/**
 * child class HelicopterCargo from AircraftBaseClass
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class HelicopterCargo extends AircraftBaseClass{
    
    private int cargoCapacity;
    
    HelicopterCargo(String md, int fcp, int fcs, int sp, int cp) {
        super(md, fcp, fcs, sp);
        cargoCapacity = cp; 
    }
    
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    void setCargoCapacity(int cp) {
        cargoCapacity = cp;
    }
}
