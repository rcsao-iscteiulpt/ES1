package antiSpamFilter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JTextPane;

public class Window {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel1 = new JPanel();
		frame.getContentPane().add(panel1);
		panel1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel1_1 = new JPanel();
		panel1.add(panel1_1);
		GridBagLayout gbl_panel1_1 = new GridBagLayout();
		gbl_panel1_1.columnWidths = new int[]{99, 130, 117, 0};
		gbl_panel1_1.rowHeights = new int[]{29, 0};
		gbl_panel1_1.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel1_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel1_1.setLayout(gbl_panel1_1);
		
		textField1 = new JTextField();
		GridBagConstraints gbc_textField1 = new GridBagConstraints();
		gbc_textField1.anchor = GridBagConstraints.WEST;
		gbc_textField1.insets = new Insets(0, 0, 0, 5);
		gbc_textField1.gridx = 1;
		gbc_textField1.gridy = 0;
		panel1_1.add(textField1, gbc_textField1);
		textField1.setColumns(10);
		
		JButton Rules_cf_Button = new JButton("Rules.cf");
		GridBagConstraints gbc_Rules_cf_Button = new GridBagConstraints();
		gbc_Rules_cf_Button.anchor = GridBagConstraints.NORTHWEST;
		gbc_Rules_cf_Button.gridx = 2;
		gbc_Rules_cf_Button.gridy = 0;
		panel1_1.add(Rules_cf_Button, gbc_Rules_cf_Button);
		
		JPanel panel1_2 = new JPanel();
		panel1.add(panel1_2);
		GridBagLayout gbl_panel1_2 = new GridBagLayout();
		gbl_panel1_2.columnWidths = new int[]{99, 130, 117, 0};
		gbl_panel1_2.rowHeights = new int[]{29, 0};
		gbl_panel1_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel1_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel1_2.setLayout(gbl_panel1_2);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		GridBagConstraints gbc_textField2 = new GridBagConstraints();
		gbc_textField2.anchor = GridBagConstraints.WEST;
		gbc_textField2.insets = new Insets(0, 0, 0, 5);
		gbc_textField2.gridx = 1;
		gbc_textField2.gridy = 0;
		panel1_2.add(textField2, gbc_textField2);
		
		JButton Spam_log_Button = new JButton("SPAM.log");
		GridBagConstraints gbc_Spam_log_Button = new GridBagConstraints();
		gbc_Spam_log_Button.anchor = GridBagConstraints.NORTHWEST;
		gbc_Spam_log_Button.gridx = 2;
		gbc_Spam_log_Button.gridy = 0;
		panel1_2.add(Spam_log_Button, gbc_Spam_log_Button);
		
		JPanel panel1_3 = new JPanel();
		panel1.add(panel1_3);
		GridBagLayout gbl_panel1_3 = new GridBagLayout();
		gbl_panel1_3.columnWidths = new int[]{99, 130, 117, 0};
		gbl_panel1_3.rowHeights = new int[]{29, 0, 0};
		gbl_panel1_3.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel1_3.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel1_3.setLayout(gbl_panel1_3);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		GridBagConstraints gbc_textField3 = new GridBagConstraints();
		gbc_textField3.anchor = GridBagConstraints.WEST;
		gbc_textField3.insets = new Insets(0, 0, 5, 5);
		gbc_textField3.gridx = 1;
		gbc_textField3.gridy = 0;
		panel1_3.add(textField3, gbc_textField3);
		
		JButton Ham_log_Button = new JButton("Ham.log");
		GridBagConstraints gbc_Ham_log_Button = new GridBagConstraints();
		gbc_Ham_log_Button.insets = new Insets(0, 0, 5, 0);
		gbc_Ham_log_Button.anchor = GridBagConstraints.NORTHWEST;
		gbc_Ham_log_Button.gridx = 2;
		gbc_Ham_log_Button.gridy = 0;
		panel1_3.add(Ham_log_Button, gbc_Ham_log_Button);
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2);
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel2_1 = new JPanel();
		panel2.add(panel2_1);
		panel2_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel2_1_1 = new JPanel();
		panel2_1.add(panel2_1_1);
		panel2_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list1 = new JList();
		panel2_1_1.add(list1);
		
		JList list2 = new JList();
		panel2_1_1.add(list2);
		
		JPanel panel2_1_2 = new JPanel();
		panel2_1.add(panel2_1_2);
		panel2_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextPane txtpnFp = new JTextPane();
		txtpnFp.setText("FP:");
		txtpnFp.setEditable(false);
		panel2_1_2.add(txtpnFp);
		
		JTextPane txtpnFn = new JTextPane();
		txtpnFn.setText("FN:");
		panel2_1_2.add(txtpnFn);
		
		JPanel panel2_2 = new JPanel();
		panel2.add(panel2_2);
		panel2_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton avaliacao_qualidade_conf_button = new JButton("Avaliaçao Qualidade Conf");
		panel2_2.add(avaliacao_qualidade_conf_button);
		
		JButton gravar_conf_button = new JButton("Gravar Configuraçao");
		panel2_2.add(gravar_conf_button);
		
		JPanel panel3 = new JPanel();
		frame.getContentPane().add(panel3);
		
		JPanel panel3_1 = new JPanel();
		panel3.add(panel3_1);
		panel3_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel3_1_1 = new JPanel();
		panel3_1.add(panel3_1_1);
		panel3_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList list = new JList();
		panel3_1_1.add(list);
		
		JList list_1 = new JList();
		panel3_1_1.add(list_1);
		
		JPanel panel3_1_2 = new JPanel();
		panel3_1.add(panel3_1_2);
		panel3_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextPane textPane = new JTextPane();
		textPane.setText("FP:");
		textPane.setEditable(false);
		panel3_1_2.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("FN:");
		panel3_1_2.add(textPane_1);
		
		JPanel panel3_2 = new JPanel();
		panel3.add(panel3_2);
		panel3_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("Gerar Conf Automatica");
		panel3_2.add(button);
		
		JButton button_1 = new JButton("Gravar Conf");
		panel3_2.add(button_1);
	}

}
