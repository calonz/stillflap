package org.macesdev.stillflap.scripts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;
import org.macesdev.stillflap.run;

public class languageSettings {
	public static String language = "";
	
	public static String script(boolean setValue, String newLangValue) {
		if (setValue == false) {
			if (Locale.getDefault().getLanguage().toString() == "tr") {
				language = "tr_TR";
			} else if (Locale.getDefault().getLanguage().toString() != "tr"){
				language = "en_US";
			}
			
			return language;
		} else {
			return language = newLangValue;
		}
	}
	
	public static String LVer() throws IOException, JSONException {
		return readSaveFile.ver();
	}
	
	public static String LLang() throws IOException, JSONException {
		return readSaveFile.lang();
	}
}

class readSaveFile {
	public static String ver() throws IOException, JSONException {
		String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        BufferedReader br = new BufferedReader(new FileReader(path + "/gameConfig.json"));            
        String line;  
        StringBuilder sbuilderObj = new StringBuilder();
        while((line=br.readLine()) !=null){
            sbuilderObj.append(line);
        }
        JSONObject jsonObj = new JSONObject(sbuilderObj.toString());
          
        String version = jsonObj.getString("version");
                
        return version;
	}
	public static String lang() throws IOException, JSONException {
		String a = "tr_TR";
		return a;
	}
}
