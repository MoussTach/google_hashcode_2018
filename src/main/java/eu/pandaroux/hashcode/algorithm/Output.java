package eu.pandaroux.hashcode.algorithm;

import eu.pandaroux.hashcode.parser.ResultData;

import java.io.PrintWriter;

public class Output {

    public Output(ResultData result) {
        PrintWriter writer = new PrintWriter("NAME.txt", "UTF-8");
        for (int i = 0; i < result.getVehicules().size(); i++) {
            writer.print(result.getVehicules().get(i).resultLine());
        }
    }
}
