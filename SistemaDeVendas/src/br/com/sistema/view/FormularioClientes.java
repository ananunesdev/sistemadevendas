package br.com.sistema.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioClientes frame = new FormularioClientes();
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
	public FormularioClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 784, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Clientes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 784, 70);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 81, 784, 403);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Código:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 35, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 32, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 63, 46, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 60, 413, 20);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Pesquisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(489, 59, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setBounds(10, 94, 46, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(66, 91, 267, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Celular:");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setBounds(343, 94, 46, 14);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(399, 91, 142, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Telefone:");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1_1.setBounds(551, 95, 46, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(607, 93, 154, 20);
		panel_1.add(textField_4);
	}
}
