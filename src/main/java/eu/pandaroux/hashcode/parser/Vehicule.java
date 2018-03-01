package eu.pandaroux.hashcode.parser;

public class Vehicule {

    private Junction actualJunction;
    private RideData actualRide;
    private String historic;
    private long historicNumber;

    public Vehicule(Junction actualJunction)
    {
        this.actualJunction = actualJunction;
        actualRide = null;
    }

    public boolean goTo(Junction newJuction, long actualStep)
    {
        this.actualJunction = newJuction;

        String step = String.format("%d ", actualStep);
        historic = step + historic;

        historicNumber++;
        return (true);
    }

    public void setActualRide(RideData actualRide) {
        this.actualRide = actualRide;
    }

    public String resultLine()
    {
        String resultLine;

        resultLine = String.format("%d %s\n", historicNumber, historic);
        return (resultLine);
    }

    public RideData getActualRide() {
        return actualRide;
    }

    public Junction getActualJunction() {
        return actualJunction;
    }
}
