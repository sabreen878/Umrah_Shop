package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReader1 {
	
	
public String firstname, lastname, email, password, phone;
	
	public void jsonReader1() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData1.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			firstname = (String) user.get("firstname");
			System.out.println(firstname);

			lastname = (String) user.get("lastname");
			System.out.println(lastname);

			email = (String) user.get("email");
			System.out.println(email);
			
			password = (String) user.get("password");
			System.out.println(password);
			
			phone = (String) user.get("phone");
			System.out.println(phone);
		}

	}


}
