package antiSpamFilter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Window {

	private JFrame frame;
	private JTextField Path_rules;
	private JTextField Path_Spam;
	private JTextField Path_Ham;

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
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 997, 935);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[] {262, 244, 0};
		gridBagLayout.columnWidths = new int[] {3};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel_paths_files = new JPanel();
		panel_paths_files.setBackground(Color.BLACK);
		panel_paths_files.setForeground(Color.BLACK);
		GridBagConstraints gbc_panel_paths_files = new GridBagConstraints();
		gbc_panel_paths_files.insets = new Insets(0, 0, 5, 0);
		gbc_panel_paths_files.fill = GridBagConstraints.BOTH;
		gbc_panel_paths_files.gridx = 0;
		gbc_panel_paths_files.gridy = 0;
		frame.getContentPane().add(panel_paths_files, gbc_panel_paths_files);
		GridBagLayout gbl_panel_paths_files = new GridBagLayout();
		gbl_panel_paths_files.columnWidths = new int[]{496, 173, 308, 0};
		gbl_panel_paths_files.rowHeights = new int[]{257, 0};
		gbl_panel_paths_files.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_paths_files.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_paths_files.setLayout(gbl_panel_paths_files);
		
		JPanel panel_paths = new JPanel();
		panel_paths.setBackground(Color.BLACK);
		GridBagConstraints gbc_panel_paths = new GridBagConstraints();
		gbc_panel_paths.fill = GridBagConstraints.BOTH;
		gbc_panel_paths.insets = new Insets(0, 0, 0, 5);
		gbc_panel_paths.gridx = 0;
		gbc_panel_paths.gridy = 0;
		panel_paths_files.add(panel_paths, gbc_panel_paths);
		panel_paths.setLayout(new GridLayout(3, 0, 1, 20));
		
		Path_rules = new JTextField();
		Path_rules.setEditable(false);
		Path_rules.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Path_rules.setHorizontalAlignment(SwingConstants.CENTER);
		Path_rules.setText("adasda");
		panel_paths.add(Path_rules);
		Path_rules.setColumns(10);
		
		Path_Spam = new JTextField();
		Path_Spam.setEditable(false);
		panel_paths.add(Path_Spam);
		Path_Spam.setColumns(10);
		
		Path_Ham = new JTextField();
		Path_Ham.setEditable(false);
		panel_paths.add(Path_Ham);
		Path_Ham.setColumns(10);
		
		JPanel panel_change_buttons = new JPanel();
		panel_change_buttons.setBackground(Color.BLACK);
		GridBagConstraints gbc_panel_change_buttons = new GridBagConstraints();
		gbc_panel_change_buttons.fill = GridBagConstraints.BOTH;
		gbc_panel_change_buttons.insets = new Insets(0, 0, 0, 5);
		gbc_panel_change_buttons.gridx = 1;
		gbc_panel_change_buttons.gridy = 0;
		panel_paths_files.add(panel_change_buttons, gbc_panel_change_buttons);
		panel_change_buttons.setLayout(new GridLayout(3, 0, 0, 20));
		
		JButton Change_Path_Rules = new JButton("Change Path");
		Change_Path_Rules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		Change_Path_Rules.setBackground(Color.BLACK);
		Change_Path_Rules.setForeground(Color.BLACK);
		panel_change_buttons.add(Change_Path_Rules);
		
		JButton Change_Path_Spam = new JButton("Change Path");
		panel_change_buttons.add(Change_Path_Spam);
		
		JButton Change_Path_Ham = new JButton("Change Path");
		panel_change_buttons.add(Change_Path_Ham);
		
		JPanel panel_files_names = new JPanel();
		panel_files_names.setBackground(Color.BLACK);
		GridBagConstraints gbc_panel_files_names = new GridBagConstraints();
		gbc_panel_files_names.fill = GridBagConstraints.BOTH;
		gbc_panel_files_names.gridx = 2;
		gbc_panel_files_names.gridy = 0;
		panel_paths_files.add(panel_files_names, gbc_panel_files_names);
		panel_files_names.setLayout(new GridLayout(0, 1, 0, 20));
		
		JLabel file1 = new JLabel("Rules.cf");
		file1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		file1.setHorizontalAlignment(SwingConstants.CENTER);
		file1.setForeground(Color.WHITE);
		panel_files_names.add(file1);
		
		JLabel file2 = new JLabel("Spam.log");
		file2.setBackground(Color.PINK);
		file2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		file2.setForeground(Color.WHITE);
		file2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_files_names.add(file2);
		
		JLabel file3 = new JLabel("Ham.log");
		file3.setHorizontalAlignment(SwingConstants.CENTER);
		file3.setForeground(Color.WHITE);
		file3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_files_names.add(file3);
		
		JPanel panel_manual_conf = new JPanel();
		panel_manual_conf.setBackground(Color.BLACK);
		GridBagConstraints gbc_panel_manual_conf = new GridBagConstraints();
		gbc_panel_manual_conf.insets = new Insets(0, 0, 5, 0);
		gbc_panel_manual_conf.fill = GridBagConstraints.BOTH;
		gbc_panel_manual_conf.gridx = 0;
		gbc_panel_manual_conf.gridy = 1;
		frame.getContentPane().add(panel_manual_conf, gbc_panel_manual_conf);
		GridBagLayout gbl_panel_manual_conf = new GridBagLayout();
		gbl_panel_manual_conf.columnWidths = new int[]{681, 295, 0};
		gbl_panel_manual_conf.rowHeights = new int[]{239, 0};
		gbl_panel_manual_conf.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_manual_conf.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_manual_conf.setLayout(gbl_panel_manual_conf);
		
		JPanel panel_left = new JPanel();
		GridBagConstraints gbc_panel_left = new GridBagConstraints();
		gbc_panel_left.fill = GridBagConstraints.BOTH;
		gbc_panel_left.insets = new Insets(0, 0, 0, 5);
		gbc_panel_left.gridx = 0;
		gbc_panel_left.gridy = 0;
		panel_manual_conf.add(panel_left, gbc_panel_left);
		GridBagLayout gbl_panel_left = new GridBagLayout();
		gbl_panel_left.columnWidths = new int[]{543, 132, 0};
		gbl_panel_left.rowHeights = new int[]{195, 59, 0};
		gbl_panel_left.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_left.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_left.setLayout(gbl_panel_left);
		
		JTextArea list_rules_manual = new JTextArea();
		GridBagConstraints gbc_list_rules_manual = new GridBagConstraints();
		gbc_list_rules_manual.fill = GridBagConstraints.BOTH;
		gbc_list_rules_manual.insets = new Insets(0, 0, 5, 5);
		gbc_list_rules_manual.gridx = 0;
		gbc_list_rules_manual.gridy = 0;
		panel_left.add(list_rules_manual, gbc_list_rules_manual);
		
		JTextArea rules_weight_manual = new JTextArea();
		GridBagConstraints gbc_rules_weight_manual = new GridBagConstraints();
		gbc_rules_weight_manual.fill = GridBagConstraints.BOTH;
		gbc_rules_weight_manual.insets = new Insets(0, 0, 5, 0);
		gbc_rules_weight_manual.gridx = 1;
		gbc_rules_weight_manual.gridy = 0;
		panel_left.add(rules_weight_manual, gbc_rules_weight_manual);
		
		JLabel label_results_manual = new JLabel("FP:           FN:");
		label_results_manual.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_results_manual.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_results_manual = new GridBagConstraints();
		gbc_label_results_manual.fill = GridBagConstraints.BOTH;
		gbc_label_results_manual.insets = new Insets(0, 0, 0, 5);
		gbc_label_results_manual.gridx = 0;
		gbc_label_results_manual.gridy = 1;
		panel_left.add(label_results_manual, gbc_label_results_manual);
		
		JPanel panel_right = new JPanel();
		GridBagConstraints gbc_panel_right = new GridBagConstraints();
		gbc_panel_right.fill = GridBagConstraints.BOTH;
		gbc_panel_right.gridx = 1;
		gbc_panel_right.gridy = 0;
		panel_manual_conf.add(panel_right, gbc_panel_right);
		panel_right.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_avaliar = new JButton("Avaliar Configuracao Manual");
		button_avaliar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_right.add(button_avaliar);
		
		JButton button_gravar_manual = new JButton("Gravar Configuracao Manual");
		button_gravar_manual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_right.add(button_gravar_manual);
		
		JPanel panel_auto_conf = new JPanel();
		GridBagConstraints gbc_panel_auto_conf = new GridBagConstraints();
		gbc_panel_auto_conf.fill = GridBagConstraints.BOTH;
		gbc_panel_auto_conf.gridx = 0;
		gbc_panel_auto_conf.gridy = 2;
		frame.getContentPane().add(panel_auto_conf, gbc_panel_auto_conf);
		GridBagLayout gbl_panel_auto_conf = new GridBagLayout();
		gbl_panel_auto_conf.columnWidths = new int[]{972, 0};
		gbl_panel_auto_conf.rowHeights = new int[]{157, 157, 0};
		gbl_panel_auto_conf.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_auto_conf.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_auto_conf.setLayout(gbl_panel_auto_conf);
		
		JPanel panel_up = new JPanel();
		GridBagConstraints gbc_panel_up = new GridBagConstraints();
		gbc_panel_up.fill = GridBagConstraints.BOTH;
		gbc_panel_up.insets = new Insets(0, 0, 5, 0);
		gbc_panel_up.gridx = 0;
		gbc_panel_up.gridy = 0;
		panel_auto_conf.add(panel_up, gbc_panel_up);
		GridBagLayout gbl_panel_up = new GridBagLayout();
		gbl_panel_up.columnWidths = new int[]{816, 158, 0};
		gbl_panel_up.rowHeights = new int[]{146, 62, 0};
		gbl_panel_up.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_up.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_up.setLayout(gbl_panel_up);
		
		JTextArea list_rules_auto = new JTextArea();
		GridBagConstraints gbc_list_rules_auto = new GridBagConstraints();
		gbc_list_rules_auto.fill = GridBagConstraints.BOTH;
		gbc_list_rules_auto.insets = new Insets(0, 0, 5, 5);
		gbc_list_rules_auto.gridx = 0;
		gbc_list_rules_auto.gridy = 0;
		panel_up.add(list_rules_auto, gbc_list_rules_auto);
		
		JTextArea rules_weight_auto = new JTextArea();
		GridBagConstraints gbc_rules_weight_auto = new GridBagConstraints();
		gbc_rules_weight_auto.fill = GridBagConstraints.BOTH;
		gbc_rules_weight_auto.insets = new Insets(0, 0, 5, 0);
		gbc_rules_weight_auto.gridx = 1;
		gbc_rules_weight_auto.gridy = 0;
		panel_up.add(rules_weight_auto, gbc_rules_weight_auto);
		
		JLabel label_results_auto = new JLabel("FP:           FN:");
		label_results_auto.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_label_results_auto = new GridBagConstraints();
		gbc_label_results_auto.fill = GridBagConstraints.BOTH;
		gbc_label_results_auto.insets = new Insets(0, 0, 0, 5);
		gbc_label_results_auto.gridx = 0;
		gbc_label_results_auto.gridy = 1;
		panel_up.add(label_results_auto, gbc_label_results_auto);
		label_results_auto.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JPanel panel_down = new JPanel();
		GridBagConstraints gbc_panel_down = new GridBagConstraints();
		gbc_panel_down.fill = GridBagConstraints.BOTH;
		gbc_panel_down.gridx = 0;
		gbc_panel_down.gridy = 1;
		panel_auto_conf.add(panel_down, gbc_panel_down);
		GridBagLayout gbl_panel_down = new GridBagLayout();
		gbl_panel_down.columnWidths = new int[]{973, 0};
		gbl_panel_down.rowHeights = new int[]{78, 71, 0};
		gbl_panel_down.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_down.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_down.setLayout(gbl_panel_down);
		
		JButton button_gerar_conf = new JButton("Gerar Configuracao Autom\u00E1tica");
		GridBagConstraints gbc_button_gerar_conf = new GridBagConstraints();
		gbc_button_gerar_conf.fill = GridBagConstraints.BOTH;
		gbc_button_gerar_conf.insets = new Insets(0, 0, 5, 0);
		gbc_button_gerar_conf.gridx = 0;
		gbc_button_gerar_conf.gridy = 0;
		panel_down.add(button_gerar_conf, gbc_button_gerar_conf);
		button_gerar_conf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton button_gravar_auto = new JButton("Gravar Configuracao Autom\u00E1tica");
		GridBagConstraints gbc_button_gravar_auto = new GridBagConstraints();
		gbc_button_gravar_auto.fill = GridBagConstraints.BOTH;
		gbc_button_gravar_auto.gridx = 0;
		gbc_button_gravar_auto.gridy = 1;
		panel_down.add(button_gravar_auto, gbc_button_gravar_auto);
		button_gravar_auto.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}


}
