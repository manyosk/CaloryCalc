package caloryCalcUI;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CategorieDlg extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the dialog.
	 */
	public CategorieDlg() {
		setResizable(false);
		setType(Type.POPUP);
		setModal(true);
		setTitle("Kategorie");
		setBounds(100, 100, 521, 300);
		
		JLabel lblCategoria = new JLabel("Categoria");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNova = new JButton("Nova");
		
		JButton btnZmenit = new JButton("Zmenit");
		
		JButton btnVymazat = new JButton("Vymazat");
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		table = new JTable();
		
		JButton btnUlozit = new JButton("Ulozit");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(458, Short.MAX_VALUE)
					.addComponent(btnClose)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(table, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(lblCategoria)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNova)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnZmenit)
							.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
							.addComponent(btnUlozit)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnVymazat)))
					.addGap(15))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoria)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNova)
						.addComponent(btnZmenit)
						.addComponent(btnVymazat)
						.addComponent(btnUlozit))
					.addGap(19)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
					.addGap(15)
					.addComponent(btnClose)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);

	}
}
