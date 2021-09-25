package org.macesdev.stillflap.scripts;

import org.json.*;

public class createSaveFile {
	public static String function(String path) throws JSONException {		
		String json = "{" +
                "language : " + org.macesdev.stillflap.scripts.languageSettings.script(false, null) + ","+
                "version : v1.0-dev, " +
                "}";
		JSONObject jsonObj = new JSONObject(json);
		System.out.println(jsonObj.toString(4));
		
	    return jsonObj.toString(4);		
	}
}
