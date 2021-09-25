package org.macesdev.stillflap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.*;
import org.macesdev.stillflap.assets.values.str;
import org.macesdev.stillflap.scripts.languageSettings;

public class run {	
	public static void main(String[] args) throws JSONException, IOException {
		// FILE_IF_NOT_EXSIST_DEDECT_LANGUAGE_CONFIG

		String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				
		File file = new File(path + "/gameConfig.json");
		if (file.exists()) {
			System.out.println(str.language());
			
			languageSettings.language = languageSettings.LLang();
			languageSettings.script(true, languageSettings.LLang());
			org.macesdev.stillflap.assets.values.str.lang = languageSettings.LLang();
			
			org.macesdev.stillflap.scenes.main.wBoot.runScene();
		} else {
			System.out.println("dosyayok");
			file.createNewFile();
		    String jsonContent = org.macesdev.stillflap.scripts.createSaveFile.function(path + "/gameConfig.json");
		    BufferedWriter writer = new BufferedWriter(new FileWriter(path + "/gameConfig.json"));
		    writer.write(jsonContent);
		    writer.close();
		    
		    org.macesdev.stillflap.scenes.main.wDialog.run();
		}		
	}
}