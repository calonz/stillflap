package org.macesdev.stillflap.scenes.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import org.json.JSONException;
import org.macesdev.stillflap.scripts.HTTPRequest;
import org.macesdev.stillflap.scripts.downloadUpdate;
import org.macesdev.stillflap.scripts.setLanguageVeriable;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class wMainMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JLabel logo2 = new JLabel("foundation");
	static JLabel logo1 = new JLabel("macesdev");
	private final JLabel logo2_1 = new JLabel("A 2D BASED JAVA GAME");
	private final JLabel build_number = new JLabel("$version");
	private final JLabel lblC = new JLabel("C 2021");
	private final JLabel lblPlay = new JLabel("PLAY");
	private final JLabel lblPlay_1 = new JLabel("PLAY");


	/**
	 * Launch the application.
	 */
	
	
	public static void runScene() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wMainMenu frame = new wMainMenu();
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
	 * @throws InterruptedException 
	 */
	
	public wMainMenu() throws IOException, JSONException, InterruptedException {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {

			}
		});
		
		ImageIcon img = new ImageIcon("/org/macesdev/stillflap/assets/img/loading.png");
		setIconImage(img.getImage());
		
		setTitle("StillFlap - Loading Assets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 65, 650, 450);
		setBackground(Color.BLACK);
		setLocationRelativeTo(null);
		setVisible(false);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(null);
		setContentPane(contentPane);

		logo1.setHorizontalAlignment(SwingConstants.CENTER);
		logo1.setForeground(Color.WHITE);
		logo1.setFont(new Font("Ubuntu", Font.BOLD, 24));
		logo1.setBounds(-77, 330, 324, 42);
		contentPane.add(logo1);
		
		logo2.setHorizontalAlignment(SwingConstants.CENTER);
		logo2.setForeground(Color.WHITE);
		logo2.setFont(new Font("Ubuntu", Font.BOLD, 16));
		logo2.setBounds(-77, 358, 324, 42);
		contentPane.add(logo2);
		
		JLabel lblMainMenu = new JLabel("StillFlap");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setForeground(Color.WHITE);
		lblMainMenu.setFont(new Font("Ubuntu", Font.BOLD, 24));
		lblMainMenu.setBounds(12, 26, 576, 42);
		contentPane.add(lblMainMenu);
		logo2_1.setHorizontalAlignment(SwingConstants.CENTER);
		logo2_1.setForeground(Color.WHITE);
		logo2_1.setFont(new Font("Ubuntu", Font.BOLD, 16));
		logo2_1.setBounds(12, 54, 576, 42);
		
		contentPane.add(logo2_1);
		build_number.setHorizontalAlignment(SwingConstants.RIGHT);
		build_number.setForeground(Color.WHITE);
		build_number.setFont(new Font("Ubuntu", Font.PLAIN, 18));
		build_number.setBounds(249, 313, 324, 32);
		
		contentPane.add(build_number);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setForeground(Color.WHITE);
		lblC.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		lblC.setBounds(-77, 313, 324, 32);
		
		contentPane.add(lblC);
		lblPlay.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlay.setForeground(Color.WHITE);
		lblPlay.setFont(new Font("Ubuntu", Font.BOLD, 24));
		lblPlay.setBounds(12, 108, 576, 60);
		
		contentPane.add(lblPlay);
		lblPlay_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlay_1.setForeground(Color.WHITE);
		lblPlay_1.setFont(new Font("Ubuntu", Font.BOLD, 24));
		lblPlay_1.setBounds(12, 170, 576, 60);
		
		contentPane.add(lblPlay_1);
		
		String lang;
		try {
			lang = setLanguageVeriable.parseJSON("language");
			
			if (lang.equals("tr_TR")) {
				setTitle(org.macesdev.stillflap.assets.lang.tr_TR.wMainMenu_Title);
				build_number.setText("v" + org.macesdev.stillflap.assets.lang.tr_TR.version + "-dev");
			} else {
				setTitle(org.macesdev.stillflap.assets.lang.en_US.wMainMenu_Title);
				build_number.setText("v" + org.macesdev.stillflap.assets.lang.en_US.version + "-dev");

			}
		} catch (JSONException | IOException e1) {
			e1.printStackTrace();
		}
	}
}