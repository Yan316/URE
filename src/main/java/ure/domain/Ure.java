package ure.domain;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Ure {
    public final static String URE_FILE_PATH = "/src/main/webapp/WEB-INF/resources/ure/ruleBook";
    public JSONArray getUreFromFile() throws IOException, ParseException {
        FileReader fileReader = new FileReader(getUreFilePath());
        JSONParser jsonParser = new JSONParser();
        return (JSONArray) jsonParser.parse(fileReader);
    }

    private String getUreFilePath() {
        return System.getProperty("user.dir")+ URE_FILE_PATH;
    }


    public static void main(String[] args) throws IOException, ParseException {
        Ure ure = new Ure();
        JSONArray ureFromFile = ure.getUreFromFile();
    }
}
