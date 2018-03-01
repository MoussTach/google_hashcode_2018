package eu.pandaroux.hashcode.parser;

import java.util.ArrayList;

public class Junction {

    private int x;
    private int y;
    private ArrayList<Vehicule> vehicules;

    public Junction(int x, int y)
    {
        this.x = x;
        this.y = y;
        vehicules = new ArrayList<Vehicule>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Vehicule> getVehicules() {
        return vehicules;
    }
}
