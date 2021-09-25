package org.macesdev.stillflap.scenes.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.macesdev.stillflap.scripts.languageSettings;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class wDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void run() {
		try {
			wDialog dialog = new wDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public wDialog() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(-1);
			}
		});
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JTextArea txtrdialogmessage = new JTextArea();
		txtrdialogmessage.setForeground(Color.WHITE);
		txtrdialogmessage.setText("$dialog_message");
		txtrdialogmessage.setBounds(297, 12, -284, 162);
		getContentPane().add(txtrdialogmessage);
		
		JLabel lblNewLabel = new JLabel("The config file could not be found. The game must be");
		
		if (languageSettings.script(false, null) == "TR") {
			lblNewLabel.setText("Yapılandırma dosyası bulunamadı. Oluşturulması");	
			setTitle("Uyarı!");
		} else {
			// 
		}
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 0, 440, 42);
		getContentPane().add(lblNewLabel);
		
		JLabel lblRestartedForIt = new JLabel("restarted for it to be created.");
		if (languageSettings.script(false, null) == "TR") {
			lblRestartedForIt.setText("için oyunu yeniden başlatın");	
		} else {
			// 
		}
		lblRestartedForIt.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestartedForIt.setForeground(Color.WHITE);
		lblRestartedForIt.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblRestartedForIt.setBounds(0, 26, 440, 42);
		getContentPane().add(lblRestartedForIt);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		setTitle("Warning");
		setBounds(100, 100, 440, 102);
	}
}
