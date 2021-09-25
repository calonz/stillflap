package org.macesdev.stillflap.scripts;

import org.json.*;

public class setLanguageVeriable {
	static String lang;
	
	public static String parseJSON() throws JSONException {
		String json = "{" +
                "language : " + org.macesdev.stillflap.scripts.languageSettings.script(false, null) + ","+
                "version : v1.0-dev, " +
                "}";
		JSONObject jsonObj = new JSONObject(json);
		
	    return jsonObj.toString(4);	
	}
}