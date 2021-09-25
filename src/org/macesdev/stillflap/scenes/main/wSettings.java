package org.macesdev.stillflap.scenes.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class wSettings extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wSettings frame = new wSettings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public wSettings() {
		setTitle("StillFlap - Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 65, 600, 400);
		setBackground(Color.BLACK);
		setLocationRelativeTo(null);
		setResizable(false);
	}

}
