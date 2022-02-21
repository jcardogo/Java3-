import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import labonemod3.Labone.User;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Java3Lab1 {

	private JFrame frmAlejandrosLabJava;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DefaultTableModel model;
	private JTable table;
	int id =3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Java3Lab1 window = new Java3Lab1();
					window.frmAlejandrosLabJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Java3Lab1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlejandrosLabJava = new JFrame();
		frmAlejandrosLabJava.setTitle("Alejandro's Lab1 Java3 using SWT");
		frmAlejandrosLabJava.setBounds(100, 100, 450, 371);
		frmAlejandrosLabJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlejandrosLabJava.getContentPane().setLayout(null);
		String[] columnNames = {"First Name:", "Last Name:", "Email:", "ID"};
		Object[][] data= {{"David",   "Beckham", "david.beckham@gmail.com", 1}, {"Gardiary", "Rukhiat", "gardiary@gmail.com", 2}, {"Zinedine", "Zidane", "zidane@hotmail.com", 3}};
		
		
		JPanel topPan = new JPanel();
		topPan.setBounds(0, 0, 434, 81);
		frmAlejandrosLabJava.getContentPane().add(topPan);
		topPan.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 30, 300, 20);
		topPan.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(120, 5, 300, 20);
		topPan.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 55, 300, 20);
		topPan.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(columnNames[0]);
		lblNewLabel.setBounds(20, 10, 65, 14);
		topPan.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(columnNames[1]);
		lblNewLabel_1.setBounds(20, 35, 65, 14);
		topPan.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(columnNames[2]);
		lblNewLabel_2.setBounds(20, 60, 65, 14);
		topPan.add(lblNewLabel_2);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setBounds(0, 80, 434, 33);
		frmAlejandrosLabJava.getContentPane().add(buttonPane);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id++;
				DefaultTableModel model =  (DefaultTableModel) table.getModel();
				User newuser = new User(textField.getText(),textField_1.getText(),textField_2.getText(),id);
				model.addRow(new Object []{textField.getText(),textField_1.getText(),textField_2.getText(),id});
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		buttonPane.add(saveButton);
		
		JButton UpdateButton = new JButton("Update");
		UpdateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			
				DefaultTableModel model =  (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				model.setValueAt(textField.getText(), i, 0);
				model.setValueAt(textField_1.getText(), i, 1);
				model.setValueAt(textField_2.getText(), i, 2);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
				
			}
		});
		buttonPane.add(UpdateButton);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model =  (DefaultTableModel) table.getModel();
				int i = table.getSelectedRow();
				model.removeRow(i);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				
			}
		});
		buttonPane.add(deleteButton);
		model = new DefaultTableModel(data, columnNames);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 113, 414, 208);
		frmAlejandrosLabJava.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowselected = table.getModel().getRowCount();
				System.out.println(rowselected);
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		ListSelectionModel model= table.getSelectionModel();
		model.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!model.isSelectionEmpty()) {
					//Get select the row
					int selectedRow = model.getMinSelectionIndex();
					System.out.println("the selected row is: " + selectedRow);
					textField.setText((String) data[selectedRow][0]);
					textField_1.setText((String) data[selectedRow][1]);
					textField_2.setText((String) data[selectedRow][2]);
				}
			}
		});
	}
	public class User{
		public String fname;
		public String lname;
		public String email;
		public int id;
		public User(String FName, String LName,String Email , int Id)
        {
            this.id = Id;
            this.fname = FName;
            this.lname = LName;
            this.email = Email;
        }
	}
}
