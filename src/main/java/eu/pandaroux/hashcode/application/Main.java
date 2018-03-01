package eu.pandaroux.hashcode.application;

import eu.pandaroux.hashcode.parser.ParserFile;
import eu.pandaroux.hashcode.parser.ResultData;

public class Main {

    public static void main(String[] args)
    {
        if (args.length != 1)
            return ;

        ParserFile parserFile = new ParserFile(args[0]);
        ResultData dataType = parserFile.parseThisFile();

        System.out.println(dataType.getNumberOfRide());
    }
}
