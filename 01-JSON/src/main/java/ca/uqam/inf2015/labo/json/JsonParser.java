package ca.uqam.inf2015.labo.json;

import org.json.JSONArray;

public class JsonParser {

    public JSONArray JSONStringToJSONArray(String jsonString){
        return new JSONArray(jsonString);
    }

}
