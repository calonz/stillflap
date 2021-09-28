package org.macesdev.stillflap.scenes.main;

import javax.swing.JDialog;

import org.json.JSONException;
import org.macesdev.stillflap.run;
import org.macesdev.stillflap.scripts.setLanguageVeriable;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.IntelliJTheme;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class wDownloadUpdate extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void run() {
		try {
			wDownloadUpdate dialog = new wDownloadUpdate();
			dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public wDownloadUpdate() throws MalformedURLException, IOException {
		setAlwaysOnTop(true);
		try {
			IntelliJTheme.setup(wDownloadUpdate.class.getResourceAsStream(
				    "/org/macesdev/stillflap/assets/themes/DarkFlatTheme.theme.json" ) );

  	    } catch (Exception e1) {
  	      e1.printStackTrace();
  	    }
		
		setResizable(false);
		addWindowListener(new WindowAdapter() {			
			@Override
			public void windowClosed(WindowEvent e) {

			}
			@Override
			public void windowOpened(WindowEvent e) {
				try {
					org.macesdev.stillflap.scenes.main.wBoot.enableCompoments(false);
					
					String path = run.class.getProtectionDomain().getCodeSource().getLocation().getPath();
					
					while (org.macesdev.stillflap.scripts.downloadUpdate.run("aaa") == 207058) {
						
						File file = new File(path + "/game-1.1.jar");
						if(file.exists()) {
							System.out.println("Update Succesfuly Downloaded!");
						}
						break;
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}	
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					org.macesdev.stillflap.scripts.downloadUpdate.runNewUpdate();
					setVisible(false);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ImageIcon img = new ImageIcon("/org/macesdev/stillflap/assets/img/updating.png");
		setIconImage(img.getImage());
		
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JTextArea txtrdialogmessage = new JTextArea();
		txtrdialogmessage.setForeground(Color.WHITE);
		txtrdialogmessage.setText("$dialog_message");
		txtrdialogmessage.setBounds(297, 12, -284, 162);
		getContentPane().add(txtrdialogmessage);
		
		JLabel lblNewLabel = new JLabel("$text1");
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblNewLabel.setBounds(6, 12, 382, 42);
		getContentPane().add(lblNewLabel);
		
		JLabel lblRestartedForIt = new JLabel("$text2");

		lblRestartedForIt.setHorizontalAlignment(SwingConstants.CENTER);
		lblRestartedForIt.setForeground(Color.WHITE);
		lblRestartedForIt.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblRestartedForIt.setBounds(6, 37, 382, 42);
		getContentPane().add(lblRestartedForIt);
		
		JButton btnNewButton = new JButton("$text3");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					org.macesdev.stillflap.scripts.downloadUpdate.runNewUpdate();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		btnNewButton.setBounds(125, 91, 149, 26);
		getContentPane().add(btnNewButton);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		setTitle("Update Alert");
		setBounds(100, 100, 404, 177);
		
		String lang;
		try {
			lang = setLanguageVeriable.parseJSON("language");
			
			if (lang.equals("tr_TR")) {
				lblRestartedForIt.setText(org.macesdev.stillflap.assets.lang.tr_TR.downloadingNow_part2);	
				lblNewLabel.setText(org.macesdev.stillflap.assets.lang.tr_TR.downloadingNow_part1);	
				btnNewButton.setText(org.macesdev.stillflap.assets.lang.tr_TR.restartUpdate);
				setTitle(org.macesdev.stillflap.assets.lang.tr_TR.wDownloadUpdate_Title);
			} else {
				lblRestartedForIt.setText(org.macesdev.stillflap.assets.lang.en_US.downloadingNow_part2);	
				lblNewLabel.setText(org.macesdev.stillflap.assets.lang.en_US.downloadingNow_part1);	
				btnNewButton.setText(org.macesdev.stillflap.assets.lang.en_US.restartUpdate);
				setTitle(org.macesdev.stillflap.assets.lang.en_US.wDownloadUpdate_Title);
			}
		} catch (JSONException | IOException e1) {
			e1.printStackTrace();
		}
	}
}
