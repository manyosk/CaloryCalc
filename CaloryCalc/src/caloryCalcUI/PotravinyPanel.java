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
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCategoria.setBounds(10, 11, 58, 14);
		add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setBounds(65, 8, 116, 20);
		add(comboBoxCategoria);
		
		JButton btnNovaKategoria = new JButton("Nova Kategoria");
		btnNovaKategoria.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNovaKategoria.setBounds(191, 7, 107, 23);
		add(btnNovaKategoria);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 679, 11);
		add(separator);
		
		table = new JTable();
		table.setBounds(331, 58, 358, 306);
		add(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Info", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(20, 55, 289, 137);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPotravina = new JLabel("Potravina");
		lblPotravina.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPotravina.setBounds(10, 21, 46, 14);
		panel.add(lblPotravina);
		
		textField = new JTextField();
		textField.setBounds(66, 18, 204, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblS = new JLabel("S");
		lblS.setBounds(10, 54, 16, 14);
		panel.add(lblS);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 51, 40, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblT = new JLabel("T");
		lblT.setBounds(76, 54, 16, 14);
		panel.add(lblT);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 51, 40, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(141, 54, 15, 14);
		panel.add(lblB);
		
		textField_3 = new JTextField();
		textField_3.setBounds(151, 49, 40, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblKcal = new JLabel("kCal");
		lblKcal.setBounds(201, 54, 26, 14);
		panel.add(lblKcal);
		
		textField_4 = new JTextField();
		textField_4.setBounds(224, 49, 46, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNovy = new JButton("Novy");
		btnNovy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNovy.setBounds(10, 92, 89, 23);
		panel.add(btnNovy);
		
		JButton btnUlozit = new JButton("Ulozit");
		btnUlozit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnUlozit.setBounds(102, 92, 89, 23);
		panel.add(btnUlozit);
		
		JButton btnZmazat = new JButton("Zmazat");
		btnZmazat.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnZmazat.setBounds(190, 92, 89, 23);
		panel.add(btnZmazat);

	}
}
