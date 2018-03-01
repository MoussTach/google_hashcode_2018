package eu.pandaroux.hashcode.parser;

import java.util.ArrayList;

public class ResultData {

    private Junction[][] map_junction;
    private ArrayList<Vehicule> vehicules;
    private ArrayList<RideData> rideData;
    private long numberOfRide;
    private long numberOfStep;
    private int bonus;

    public ResultData(int size_x, int size_y, int numberOfVehicule, long numberOfRide, int bonus, long numberOfStep)
    {
        vehicules = new ArrayList<Vehicule>();
        rideData = new ArrayList<RideData>();
        map_junction = new Junction[size_x][size_y];

        for (int nbVehicule = 0; nbVehicule < numberOfVehicule; nbVehicule++)
            vehicules.add(new Vehicule(map_junction[0][0]));

        this.numberOfRide = numberOfRide;
        this.bonus = bonus;
        this.numberOfStep = numberOfStep;
    }

    public ArrayList<RideData> getRideData() {
        return rideData;
    }

    public ArrayList<Vehicule> getVehicules() {
        return vehicules;
    }

    public Junction[][] getMap_junction() {
        return map_junction;
    }

    public int getBonus() {
        return bonus;
    }

    public long getNumberOfRide() {
        return numberOfRide;
    }

    public long getNumberOfStep() {
        return numberOfStep;
    }
}
