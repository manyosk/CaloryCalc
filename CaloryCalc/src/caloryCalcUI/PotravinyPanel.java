package caloryCalcUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PotravinyPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PotravinyPanel() {
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNovaKategoria = new JButton("Nova Kategoria");
		btnNovaKategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CategorieDlg dlg = new CategorieDlg();
				dlg.setVisible(true);
				
			}
		});
		btnNovaKategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JSeparator separator = new JSeparator();
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOneTouchExpandable(true);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addComponent(btnNovaKategoria))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblCategoria))
								.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNovaKategoria))
					.addGap(6)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(splitPane, GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		splitPane.setLeftComponent(table);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setBorder(new TitledBorder(null, "Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(null);
		
		JLabel lblPotravina = new JLabel("Potravina");
		lblPotravina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPotravina.setBounds(10, 21, 46, 14);
		panel.add(lblPotravina);
		
		textField = new JTextField();
		textField.setBounds(66, 18, 217, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblS = new JLabel("S");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblS.setBounds(10, 55, 16, 14);
		panel.add(lblS);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 51, 40, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblT = new JLabel("T");
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblT.setBounds(74, 54, 16, 14);
		panel.add(lblT);
		
		textField_2 = new JTextField();
		textField_2.setBounds(96, 51, 40, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblB.setBounds(142, 54, 15, 14);
		panel.add(lblB);
		
		textField_3 = new JTextField();
		textField_3.setBounds(163, 49, 40, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblKcal = new JLabel("kCal");
		lblKcal.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblKcal.setBounds(209, 54, 26, 14);
		panel.add(lblKcal);
		
		textField_4 = new JTextField();
		textField_4.setBounds(241, 49, 46, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNovy = new JButton("Novy");
		btnNovy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNovy.setBounds(10, 92, 89, 23);
		panel.add(btnNovy);
		
		JButton btnUlozit = new JButton("Ulozit");
		btnUlozit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUlozit.setBounds(109, 92, 82, 23);
		panel.add(btnUlozit);
		
		JButton btnZmazat = new JButton("Zmazat");
		btnZmazat.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnZmazat.setBounds(201, 92, 82, 23);
		panel.add(btnZmazat);
		setLayout(groupLayout);

	}
}
