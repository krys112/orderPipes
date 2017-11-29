package orderPipes;

import javax.swing.JApplet;
import javax.swing.JPanel;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class userInterface extends Applet {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the applet.
	 */
	public userInterface() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 25, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel label = new JLabel("   ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		panel_1.add(label, gbc_label);
		
		JLabel lblSelectPlasticGrade = new JLabel("Select Plastic Grade");
		GridBagConstraints gbc_lblSelectPlasticGrade = new GridBagConstraints();
		gbc_lblSelectPlasticGrade.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectPlasticGrade.gridx = 1;
		gbc_lblSelectPlasticGrade.gridy = 1;
		panel_1.add(lblSelectPlasticGrade, gbc_lblSelectPlasticGrade);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 1;
		panel_1.add(comboBox, gbc_comboBox);
		
		JLabel label_1 = new JLabel("  ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 4;
		gbc_label_1.gridy = 1;
		panel_1.add(label_1, gbc_label_1);
		
		JLabel lblSelectNoOf = new JLabel("Select no. of colours");
		GridBagConstraints gbc_lblSelectNoOf = new GridBagConstraints();
		gbc_lblSelectNoOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectNoOf.gridx = 1;
		gbc_lblSelectNoOf.gridy = 3;
		panel_1.add(lblSelectNoOf, gbc_lblSelectNoOf);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"None", "1", "2"}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.anchor = GridBagConstraints.WEST;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 3;
		panel_1.add(comboBox_1, gbc_comboBox_1);
		
		JCheckBox chckbxInsulation = new JCheckBox("Insulation");
		GridBagConstraints gbc_chckbxInsulation = new GridBagConstraints();
		gbc_chckbxInsulation.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxInsulation.gridx = 1;
		gbc_chckbxInsulation.gridy = 5;
		panel_1.add(chckbxInsulation, gbc_chckbxInsulation);
		
		JCheckBox chckbxReinforcement = new JCheckBox("Reinforcement");
		GridBagConstraints gbc_chckbxReinforcement = new GridBagConstraints();
		gbc_chckbxReinforcement.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxReinforcement.anchor = GridBagConstraints.WEST;
		gbc_chckbxReinforcement.gridx = 2;
		gbc_chckbxReinforcement.gridy = 5;
		panel_1.add(chckbxReinforcement, gbc_chckbxReinforcement);
		
		JCheckBox chckbxChemicalResistance = new JCheckBox("Chemical Resistance");
		GridBagConstraints gbc_chckbxChemicalResistance = new GridBagConstraints();
		gbc_chckbxChemicalResistance.anchor = GridBagConstraints.WEST;
		gbc_chckbxChemicalResistance.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxChemicalResistance.gridx = 3;
		gbc_chckbxChemicalResistance.gridy = 5;
		panel_1.add(chckbxChemicalResistance, gbc_chckbxChemicalResistance);
		
		JLabel lblLengthm = new JLabel("Length (m)");
		GridBagConstraints gbc_lblLengthm = new GridBagConstraints();
		gbc_lblLengthm.anchor = GridBagConstraints.EAST;
		gbc_lblLengthm.insets = new Insets(0, 0, 5, 5);
		gbc_lblLengthm.gridx = 1;
		gbc_lblLengthm.gridy = 7;
		panel_1.add(lblLengthm, gbc_lblLengthm);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 7;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblDiameterin = new JLabel("Diameter (in)");
		GridBagConstraints gbc_lblDiameterin = new GridBagConstraints();
		gbc_lblDiameterin.anchor = GridBagConstraints.EAST;
		gbc_lblDiameterin.insets = new Insets(0, 0, 0, 5);
		gbc_lblDiameterin.gridx = 1;
		gbc_lblDiameterin.gridy = 8;
		panel_1.add(lblDiameterin, gbc_lblDiameterin);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 0, 5);
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 8;
		panel_1.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();

	}

}
