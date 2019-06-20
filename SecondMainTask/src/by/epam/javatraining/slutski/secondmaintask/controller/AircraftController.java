package by.epam.javatraining.slutski.secondmaintask.controller;

import by.epam.javatraining.slutski.secondmaintask.controller.Airship;
import org.apache.log4j.Logger;
import by.epam.javatraining.slutski.secondmaintask.model.logic.AircraftBusinessLogic;

/**
 * Aircraft Controller
 * @author slutski
 * @version 1.0 19/06/2019
 */
public class AircraftController {

    public static Logger logger = Logger.getRootLogger();

    public static void main(String[] args) {

        Aerostat aerostat01 = new Aerostat("AE14", 1950, 10, 40, 50, 2);
        Aerostat aerostat02 = new Aerostat("AE18", 2500, 10, 50, 70, 2);
        Airship airship01 = new Airship("AS78", 5000, 15, 60, 24, 5000);
        Airship airship02 = new Airship("AS90", 6000, 15, 70, 30, 5000);
        HelicopterCargo helicop01 = new HelicopterCargo("Mi80", 15000, 30, 130, 2000);
        HelicopterCargo helicop02 = new HelicopterCargo("Mi81", 15000, 30, 130, 2500);
        PlanePassanger plane01 = new PlanePassanger("Boing714", 25000, 30, 900, 120);
        PlanePassanger plane02 = new PlanePassanger("Boing778", 30000, 30, 950, 150);

        AircraftBaseClass[] airPark = AircraftBusinessLogic.met(aerostat01,
        aerostat02, airship01, airship02, helicop01, helicop02, plane01, plane02);

        AircraftBusinessLogic.isMinFuelCapacity(airPark);
        AircraftBusinessLogic.isMaxFuelCapacity(airPark);
        
        AircraftBusinessLogic.isMinDistance(airPark);
        AircraftBusinessLogic.isMaxDistance(airPark);
        
        AircraftBusinessLogic.totalFuelConsumption(airPark);
        
        AircraftBusinessLogic.sortBySpeed(airPark);
    }
}
