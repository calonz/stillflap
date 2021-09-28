
package org.macesdev.stillflap;

import java.io.File;
import java.io.IOException;

import org.json.*;
import org.macesdev.stillflap.scripts.setLanguageVeriable;

public class run {
	public static void main(String[] args) throws JSONException, IOException {
		// FILE_IF_NOT_EXSIST_DEDECT_LANGUAGE_CONFIG

		String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();
				
		File file = new File(path + "/gameConfig.json");
		if (file.exists()) {
			org.macesdev.stillflap.scenes.main.wBoot.runScene();
		} else {
			file.createNewFile();
			setLanguageVeriable.createJSON("1.1");
		    org.macesdev.stillflap.scenes.main.wDialog.run();
		}		
	}
}