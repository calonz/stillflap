package org.macesdev.stillflap.scripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.*;
import org.macesdev.stillflap.run;

public class setLanguageVeriable {
	static String lang;
	static String jsonData;
	static String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "/gameConfig.json";

	
	public static String parseJSON() throws JSONException, FileNotFoundException {
		File myObj = new File(path);
	    Scanner myReader = new Scanner(myObj);
	    while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        jsonData = data;
	        System.out.println(data);
	    }
	    myReader.close();
	    
	    JSONParser parser = new JSONParser();

	    Object obj = parser.parse(new FileReader("simple.json"));

	    JSONObject jsonObject = (JSONObject) obj;

	    for(Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext();) {
	      String key = (String) iterator.next();
	      System.out.println(jsonObject.get(key));
	    }
		return null;
	}
	
	public static void createJSON() throws IOException {
        JSONObject jo = new JSONObject();
          
        try {
			jo.put("version", org.macesdev.stillflap.assets.lang.en_US.version);
	        jo.put("language", org.macesdev.stillflap.scripts.languageSettings.script(false, null));
		} catch (JSONException e) {
			e.printStackTrace();
		}

          
	    String jsonContent = jo.toString();
	    BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	    writer.write(jsonContent);
	    writer.close();
	}
}