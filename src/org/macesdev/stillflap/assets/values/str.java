package org.macesdev.stillflap.assets.values;

import java.io.IOException;

import org.json.JSONException;
import org.macesdev.stillflap.scripts.languageSettings;

public class str {
	public static String lang = "";
	
	public static String language() throws IOException, JSONException {
		return lang = languageSettings.LLang();
	}
}
