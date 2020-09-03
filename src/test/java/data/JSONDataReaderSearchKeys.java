package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReaderSearchKeys {
	
	
public String fromcity, tocity;
	
	public void jsonReaderContactKeys() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserDataSearchKeys.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			fromcity = (String) user.get("fromcity");
			System.out.println(fromcity);

			tocity = (String) user.get("tocity");
			System.out.println(tocity);

		}

	}


}
