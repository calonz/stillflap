package org.macesdev.stillflap.scenes.main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.macesdev.stillflap.run;
import org.macesdev.stillflap.scripts.languageSettings;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SuppressWarnings("serial")
public class wBoot extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void runScene() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wBoot frame = new wBoot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws JSONException 
	 * @throws IOException 
	 */
	public wBoot() throws IOException, JSONException {
		setTitle("StillFlap - Loading Assets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 65, 600, 400);
		setBackground(Color.BLACK);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel build_number = new JLabel("$build_number");
		build_number.setHorizontalAlignment(SwingConstants.RIGHT);
		build_number.setForeground(Color.WHITE);
		build_number.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		build_number.setBounds(446, 327, 134, 24);
		contentPane.add(build_number);
		
		JLabel subtext = new JLabel("$checkForUpdates_level1");
				
		subtext.setHorizontalAlignment(SwingConstants.LEFT);
		subtext.setForeground(Color.WHITE);
		subtext.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		subtext.setBounds(12, 327, 324, 24);
		contentPane.add(subtext);
		
		if (checkLang.lang() == "tr_TR") {
			subtext.setText(org.macesdev.stillflap.assets.lang.tr_TR.checkForUpdates_level1);
		} else {
			subtext.setText(org.macesdev.stillflap.assets.lang.en_US.checkForUpdates_level1);
		}
		
		JLabel logo1 = new JLabel("macesdev");
		logo1.setHorizontalAlignment(SwingConstants.CENTER);
		logo1.setForeground(Color.WHITE);
		logo1.setFont(new Font("Ubuntu", Font.BOLD, 28));
		logo1.setBounds(136, 136, 324, 42);
		contentPane.add(logo1);
		
		JLabel logo2 = new JLabel("foundation");
		logo2.setHorizontalAlignment(SwingConstants.CENTER);
		logo2.setForeground(Color.WHITE);
		logo2.setFont(new Font("Ubuntu", Font.BOLD, 20));
		logo2.setBounds(136, 164, 324, 42);
		contentPane.add(logo2);
	}
}

class checkLang {
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
	public static String lang() {
		String first = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		String lang = "";
		
        try {
            String contents = new String((Files.readAllBytes(Paths.get(first))));
            JSONObject o = new JSONObject(contents);
            JSONArray emails = o.getJSONArray("emails");
            for (int i = 0; i < emails.length(); i++) {
                System.out.println(emails.getString(i));
            }
            JSONObject language = new JSONObject("family");
            lang = language.getString("language");
        } catch(IOException e){
            e.printStackTrace();
        } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return lang;
	}
}
