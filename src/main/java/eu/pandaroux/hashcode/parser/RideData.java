package eu.pandaroux.hashcode.parser;

public class RideData {

    private int internalStep;

    private int start_x;
    private int start_y;

    private int end_x;
    private int end_y;

    private int earlyStart;
    private int lastFinish;

    public RideData(int start_x, int start_y, int end_x, int end_y, int early_Start, int last_finish)
    {
        internalStep = 0;

        this.start_x = start_x;
        this.start_y = start_y;

        this.end_x = end_x;
        this.end_y = end_y;

        this.earlyStart = early_Start;

        this.lastFinish = last_finish;
    }

    public int getInternalStep() {
        return internalStep;
    }

    public void incrementStep()
    {
        internalStep++;
    }

    public int getEnd_x() {
        return end_x;
    }

    public int getEnd_y() {
        return end_y;
    }

    public int getStart_x() {
        return start_x;
    }

    public int getStart_y() {
        return start_y;
    }

    public int getEarlyStart() {
        return earlyStart;
    }

    public int getLastFinish() {
        return lastFinish;
    }
}
