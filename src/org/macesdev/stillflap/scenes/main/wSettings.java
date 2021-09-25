package org.macesdev.stillflap.scenes.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

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
		getContentPane().setBackground(Color.BLACK);
		setTitle("StillFlap - Settings");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 65, 600, 400);
		setBackground(Color.BLACK);
		setLocationRelativeTo(null);
		setResizable(false);
		
		getContentPane().setLayout(null);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setForeground(Color.WHITE);
		lblSettings.setFont(new Font("Ubuntu", Font.BOLD, 17));
		lblSettings.setBounds(12, 12, 132, 48);
		getContentPane().add(lblSettings);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Apparance", "Language", "Check for Updates"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(1);
		list.setFont(new Font("Ubuntu", Font.PLAIN, 13));
		list.setForeground(Color.WHITE);
		list.setBackground(Color.BLACK);
		list.setBounds(160, 177, -147, -116);
		getContentPane().add(list);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Apparance") {
				{
					add(new DefaultMutableTreeNode("Language"));
					add(new DefaultMutableTreeNode("violet"));
					add(new DefaultMutableTreeNode("red"));
					add(new DefaultMutableTreeNode("yellow"));
				}
			}
		));
		tree.setBounds(22, 61, 132, 174);
		getContentPane().add(tree);
	}
}
