package eu.pandaroux.hashcode.algorithm;

public class Logic_Loop {
    private int[] begin_point;
    private int[] end_point;
    private int begin_step;
    private int end_step;
    private int sensx;
    private int sensy;
    private int distancex;
    private int distancey;

    public Logic_Loop(int[] bgp, int[] ep, int bs, int es, int sx, int sy, int dx, int dy)
    {
        begin_point = bgp;
        end_point = ep;
        begin_step = bs;
        end_step = es;
        sensx = sx;
        sensy = sy;
        distancex = dx;
        distancey = dy;
    }
    public void algo()
    {
        int step = 0;
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
        System.out.println(end_step);
    }
}

