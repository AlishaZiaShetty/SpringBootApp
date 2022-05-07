package com.ea.framework.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LogUtil
{
    //File format for log name
    ZonedDateTime dateTime = ZonedDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
    String fileNameFormat = dateTime.format(dateTimeFormatter);

    private BufferedWriter bufferedWriter = null;

    //Create log file
    public void CreateLogFile()
    {
        try
        {
            File dir = new File("C:/Logs/");
            if (!dir.exists())
                dir.mkdir();

            File logFile = new File(dir + "/" + fileNameFormat +".log");

            FileWriter fileWriter = new FileWriter(logFile.getAbsolutePath());

            bufferedWriter = new BufferedWriter(fileWriter);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Write(String message)
    {
        try
        {
            bufferedWriter.write(message);
            bufferedWriter.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    //Write message within log
}
