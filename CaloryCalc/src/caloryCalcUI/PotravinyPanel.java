package caloryCalcUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;

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
		setLayout(null);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 11, 58, 14);
		add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setBounds(65, 8, 116, 20);
		add(comboBoxCategoria);
		
		JButton btnNovaKategoria = new JButton("Nova Kategoria");
		btnNovaKategoria.setBounds(191, 7, 107, 23);
		add(btnNovaKategoria);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 610, 11);
		add(separator);
		
		JLabel lblPotravina = new JLabel("Potravina");
		lblPotravina.setBounds(10, 58, 46, 14);
		add(lblPotravina);
		
		textField = new JTextField();
		textField.setBounds(65, 55, 233, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(191, 106, 26, 14);
		add(lblB);
		
		JLabel lblS = new JLabel("S");
		lblS.setBounds(30, 106, 26, 14);
		add(lblS);
		
		JLabel lblT = new JLabel("T");
		lblT.setBounds(109, 106, 26, 14);
		add(lblT);
		
		JLabel lblKcal = new JLabel("kCal");
		lblKcal.setBounds(272, 106, 26, 14);
		add(lblKcal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(16, 131, 40, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 131, 40, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(169, 131, 40, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(261, 131, 40, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNovy = new JButton("Novy");
		btnNovy.setBounds(30, 193, 89, 23);
		add(btnNovy);
		
		JButton btnUlozit = new JButton("Ulozit");
		btnUlozit.setBounds(129, 193, 89, 23);
		add(btnUlozit);
		
		JButton btnZmazat = new JButton("Zmazat");
		btnZmazat.setBounds(228, 193, 89, 23);
		add(btnZmazat);
		
		table = new JTable();
		table.setBounds(331, 55, 289, 375);
		add(table);

	}
}
