package io.MMJ;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

/**
 * File created by
 * Matthew Belongia
 * Manjusha Das
 * Jay Milnamow
 */
public class Main {

    public static String readRawDataToString() throws Exception{
        Path path = Paths.get(ClassLoader.getSystemResource("RawData.txt").toURI());
        return new String(readAllBytes(get(path.toUri())));
    }

    public static void main(String[] args) throws Exception{
        ItemParser itemParser = new ItemParser();
        String currenttext= "";
        currenttext = readRawDataToString();
        itemParser.runItemParser(currenttext);

    }
}
