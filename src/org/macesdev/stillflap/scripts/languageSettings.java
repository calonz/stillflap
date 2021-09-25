package org.macesdev.stillflap.scripts;

import java.util.Locale;

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
	
}
