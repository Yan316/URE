package ure.domain;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Ure {
    public final static String URE_FILE_PATH = "/src/main/webapp/WEB-INF/resources/ure/ruleBook";

    private JSONObject getUreFromFile() throws IOException, ParseException {
        FileReader fileReader = new FileReader(getUreFilePath());
        JSONParser jsonParser = new JSONParser();
        return (JSONObject) jsonParser.parse(fileReader);
    }

    private String getUreFilePath() {
        return System.getProperty("user.dir")+ URE_FILE_PATH;
    }

    public JSONArray getUreQuestions() throws IOException, ParseException {

        JSONObject ureFromFile = getUreFromFile();
        return (JSONArray) ureFromFile.get("questions");
    }
}
