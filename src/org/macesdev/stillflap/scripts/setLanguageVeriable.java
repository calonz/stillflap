package org.macesdev.stillflap.scripts;

import java.io.BufferedReader;
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

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class setLanguageVeriable {
	public static String lang;
	static String jsonData;
	static String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "/gameConfig.json";

	
	public static String parseJSON() throws JSONException, IOException {
		File myObj = new File(path);
	    Scanner myReader = new Scanner(myObj);
	    while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        jsonData = data;
	        System.out.println(data);
	    }
	    myReader.close();
	    
	    JSONObject obj = new JSONObject(jsonData);  

		return obj.getString("language");
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