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
import java.awt.Font;


public class CaloryCalcMainWnd {

	private JFrame frame;
	private PotravinyPanel potravinyPanel;

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
		frame.setBounds(100, 100, 764, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmClose.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mnFile.add(mntmClose);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Tahoma", Font.PLAIN, 11));
		menuBar.add(mnAbout);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnPotraviny = new JButton("Potraviny");
		btnPotraviny.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPotraviny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(potravinyPanel == null)
				{
					potravinyPanel = new PotravinyPanel();
				}
				
				potravinyPanel.setVisible(true);
				frame.getContentPane().add(potravinyPanel, BorderLayout.CENTER);
				frame.revalidate();
				
			}
		});
		toolBar.add(btnPotraviny);
		
		JButton btnRecepty = new JButton("Recepty");
		btnRecepty.setFont(new Font("Tahoma", Font.PLAIN, 11));
		toolBar.add(btnRecepty);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setFont(new Font("Tahoma", Font.PLAIN, 11));
		toolBar.add(btnMenu);
	}

}
