package eu.pandaroux.hashcode.application;

import eu.pandaroux.hashcode.parser.ParserFile;
import eu.pandaroux.hashcode.parser.ResultData;
import eu.pandaroux.hashcode.algorithm.Logic_Loop;

public class Main {

    public static void main(String[] args)
    {
        if (args.length != 1)
            return ;
            Logic_Loop testlogicloop = new Logic_Loop(
                    new int[] {8, 15},
                    new int[] {2, 5},
                    2,
                    50,
                    6,
                    10,
                    6,
                    10);

        ParserFile parserFile = new ParserFile(args[0]);
        ResultData dataType = parserFile.parseThisFile();

        System.out.println(dataType.getNumberOfRide());
            testlogicloop.algo();
    }
}
