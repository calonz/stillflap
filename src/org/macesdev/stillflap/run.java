
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
			org.macesdev.stillflap.scenes.main.wBoot.runScene();
		} else {
			System.out.println("dosyayok");
			file.createNewFile();
		    String jsonContent = org.macesdev.stillflap.scripts.setLanguageVeriable.parseJSON();
		    BufferedWriter writer = new BufferedWriter(new FileWriter(path + "/gameConfig.json"));
		    writer.write(jsonContent);
		    writer.close();
		    
		    System.out.println(jsonContent);
		    
		    org.macesdev.stillflap.scenes.main.wDialog.run();
		}		
	}
}