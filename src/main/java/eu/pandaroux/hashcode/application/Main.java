package eu.pandaroux.hashcode.application;

import eu.pandaroux.hashcode.algorithm.Essai_class;
import eu.pandaroux.hashcode.algorithm.Logic_Loop;

public class Main {

    public static void main(String[] args)
    {
            Logic_Loop testlogicloop = new Logic_Loop(
                    new int[] {1, 1},
                    new int[] {4, 3},
                    1,
                    6,
                    -3,
                    -2,
                    3,
                    2);

            testlogicloop.algo();
    }
}
