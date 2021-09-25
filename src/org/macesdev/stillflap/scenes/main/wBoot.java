package org.macesdev.stillflap.scenes.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.macesdev.stillflap.run;

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