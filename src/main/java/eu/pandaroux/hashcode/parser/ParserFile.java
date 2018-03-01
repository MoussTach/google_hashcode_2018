package eu.pandaroux.hashcode.parser;

import java.io.*;

public class ParserFile {

    private String fileName;

    public ParserFile(String file)
    {
        fileName = file;
    }

    public ResultData parseThisFile()
    {
        File file = new File(fileName);
        ResultData resultData = null;

        try
        {
            FileInputStream inputStream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            if ((line = br.readLine()) != null)
                resultData = parseFirstLine(line);

            while ((line = br.readLine()) != null)
                if (resultData != null) {
                    RideData resultRide = parseRideLine(line);

                    if (resultRide != null)
                        resultData.getRideData().add(resultRide);
                }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return (resultData);
    }

    private ResultData parseFirstLine(String line)
    {
        String[] split = line.split(" ");

        if (split.length < 5)
            return (null);

        return (new ResultData(
                Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]),
                Long.parseLong(split[3]),
                Integer.parseInt(split[4]),
                Long.parseLong(split[5])
        ));
    }

    private RideData parseRideLine(String line)
    {
        String[] split = line.split(" ");

        if (split.length < 5)
            return (null);

        return (new RideData(
                Integer.parseInt(split[0]),
                Integer.parseInt(split[1]),
                Integer.parseInt(split[2]),
                Integer.parseInt(split[3]),
                Integer.parseInt(split[4]),
                Integer.parseInt(split[5])
        ));
    }
}
