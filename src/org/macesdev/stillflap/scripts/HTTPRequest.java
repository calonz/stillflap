package org.macesdev.stillflap.scripts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPRequest {
	private static HttpURLConnection connection;
	
	public static void req() throws IOException {
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		
		URL url = new URL("https://macesdev.github.io/stillflap/version.json");
		connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);
		
		int status = connection.getResponseCode();
		
		if (status > 299) {
			reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
			
			while ((line = reader.readLine()) != null) {
				responseContent.append(line);
			}
			
			reader.close();
		} else {
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			while ((line = reader.readLine()) != null) {
				responseContent.append(line);
			}
			
			reader.close();
		}
		
		System.out.println(responseContent.toString());
	}
}
