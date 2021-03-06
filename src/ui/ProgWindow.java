package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgWindow {

	private JFrame frmSortprog;
	private JTextField sizeArrayField;
	private JTextField integerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgWindow window = new ProgWindow();
					window.frmSortprog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProgWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sorting.Sort sort = new sorting.Sort();
		frmSortprog = new JFrame();
		frmSortprog.setTitle("SortProg");
		frmSortprog.setBounds(100, 100, 450, 300);
		frmSortprog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSortprog.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 128, 414, 123);
		frmSortprog.getContentPane().add(textArea);
		
		sizeArrayField = new JTextField();
		sizeArrayField.setBounds(109, 21, 117, 20);
		frmSortprog.getContentPane().add(sizeArrayField);
		sizeArrayField.setColumns(10);
		
		JLabel lblSizeOfThe = new JLabel("Size of the array:");
		lblSizeOfThe.setBounds(10, 24, 103, 14);
		frmSortprog.getContentPane().add(lblSizeOfThe);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int size = Integer.parseInt(sizeArrayField.getText());
				sort.initArray(size);
			}
		});
		btnCreate.setBounds(236, 20, 76, 23);
		frmSortprog.getContentPane().add(btnCreate);
		
		JLabel lblIntegersOfArrayenter = new JLabel("Integers of the array(Enter one by one):");
		lblIntegersOfArrayenter.setBounds(10, 58, 232, 14);
		frmSortprog.getContentPane().add(lblIntegersOfArrayenter);
		
		integerTextField = new JTextField();
		integerTextField.setBounds(10, 83, 205, 20);
		frmSortprog.getContentPane().add(integerTextField);
		integerTextField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int integer = Integer.parseInt(integerTextField.getText());
				sort.enterArr(integer);
				integerTextField.setText("");
			}
		});
		btnEnter.setBounds(236, 82, 76, 23);
		frmSortprog.getContentPane().add(btnEnter);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(sort.sort(Integer.parseInt(sizeArrayField.getText())));
			}
		});
		btnSort.setBounds(322, 82, 102, 23);
		frmSortprog.getContentPane().add(btnSort);
		
		JButton btnNewButton = new JButton("Delete arr");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sort.deleteArray();
				sizeArrayField.setText("");
			}
		});
		btnNewButton.setBounds(322, 20, 102, 23);
		frmSortprog.getContentPane().add(btnNewButton);
	}
}
