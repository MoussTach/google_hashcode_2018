package eu.pandaroux.hashcode.algorithm;

import eu.pandaroux.hashcode.parser.ResultData;
import eu.pandaroux.hashcode.parser.RideData;
import eu.pandaroux.hashcode.parser.Vehicule;

public class Logic_Loop {

    private ResultData data;

    /*
    private int[] begin_point;
    private int[] end_point;
    private int begin_step;
    private int end_step;
    private int sensx;
    private int sensy;
    private int distancex;
    private int distancey;
    */

    public Logic_Loop(ResultData data)
    {
        this.data = data;

        /*
        begin_point = bgp;
        end_point = ep;
        begin_step = bs;
        end_step = es;
        sensx = sx;
        sensy = sy;
        distancex = dx;
        distancey = dy;
        */
    }
    public void algo()
    {
        for (int nbStep = 0; nbStep < data.getNumberOfStep(); nbStep++)
        {
            for (int nbVehicule = 0; nbVehicule < data.getVehicules().size(); nbVehicule++)
            {
                Vehicule currentVehicule = data.getVehicules().get(nbVehicule);

                if (currentVehicule.getActualRide() == null)
                {
                    for (int nbRide = 0; nbRide < data.getRideData().size(); nbRide++)
                    {
                        RideData currentRide = data.getRideData().get(nbRide);
                        if (!currentRide.isUsed())
                        {
                            currentVehicule.setActualRide(currentRide);
                        }
                    }
                }


            }
        }

        /*int step = 0;
        for (step = 0; step < begin_step; step++) {
                System.out.println("wait");
        }
        System.out.println(step);
        for(int y = 0; y < distancex; y++)
        {
            if (sensx > 0){
                System.out.println("descend");
            }
                else if(sensx < 0){
                System.out.println("monte");
            }
            step++;
        }
        System.out.println(step);
        for(int y = 0; y < distancey; y++)
        {
            if (sensy > 0)
                System.out.println("gauche");
            else if(sensy < 0)
                System.out.println("droite");
            step++;
        }
        System.out.println(step);
        System.out.println(end_step);*/
    }
}

