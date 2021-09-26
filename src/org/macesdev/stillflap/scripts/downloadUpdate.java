package org.macesdev.stillflap.scripts;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.macesdev.stillflap.run;

public class downloadUpdate {
	public static int run(String a) throws MalformedURLException, IOException {
		String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		long returnedBytesDownload = 0;
		
		File file = new File(path + "/game-1.1.jar");
		
		if (file.exists()) {
			returnedBytesDownload = 207058;
		} else {
			String sourceUrl = "https://macesdev.github.io/stillflap/latest/game-1.1.jar";
	        String targetFilename = path + "/game-1.1.jar";

	        long bytesDownloaded = download(sourceUrl, targetFilename);
	        returnedBytesDownload = bytesDownloaded;

	        System.out.println(String.format("Downloaded %d bytes from %s to %s.", bytesDownloaded, sourceUrl, targetFilename));
		}	
        
        int i=(int)returnedBytesDownload;
        return i;
	}
	
    static long download(String sourceUrl, String targetFileName) throws MalformedURLException, IOException {
        try (InputStream in = URI.create(sourceUrl).toURL().openStream()) {
            return Files.copy(in, Paths.get(targetFileName));
        }
    }  
}
