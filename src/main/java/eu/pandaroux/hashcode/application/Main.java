package eu.pandaroux.hashcode.application;

import eu.pandaroux.hashcode.parser.ParserFile;
import eu.pandaroux.hashcode.parser.ResultData;
import eu.pandaroux.hashcode.algorithm.Essai_class;
import eu.pandaroux.hashcode.algorithm.Logic_Loop;

public class Main {

    public static void main(String[] args)
    {
        if (args.length != 1)
            return ;
            Logic_Loop testlogicloop = new Logic_Loop(
                    new int[] {1, 1},
                    new int[] {4, 3},
                    1,
                    6,
                    -3,
                    -2,
                    3,
                    2);

        ParserFile parserFile = new ParserFile(args[0]);
        ResultData dataType = parserFile.parseThisFile();

        System.out.println(dataType.getNumberOfRide());
            testlogicloop.algo();
    }
}
