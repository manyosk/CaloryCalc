package caloryCalcUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CaloryCalcMainWnd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaloryCalcMainWnd window = new CaloryCalcMainWnd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CaloryCalcMainWnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnPotraviny = new JButton("Potraviny");
		btnPotraviny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PotravinyPanel panel = new PotravinyPanel();
				panel.setVisible(true);
				frame.getContentPane().add(panel, BorderLayout.CENTER);
			}
		});
		toolBar.add(btnPotraviny);
		
		JButton btnRecepty = new JButton("Recepty");
		toolBar.add(btnRecepty);
		
		JButton btnMenu = new JButton("Menu");
		toolBar.add(btnMenu);
	}

}
