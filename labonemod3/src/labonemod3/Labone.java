package labonemod3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import labonemod3.Java_Populate_JTable_Using_ArrayList.User;

import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Labone {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;	 
	private DefaultTableModel model;
	int row = 0;
	int col = 0;
	int k=0;
	int id =3;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labone window = new Labone();
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
	
	
	public Labone() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 401, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	
       
     
		
		
		String[] columnNames = {"First Name", "Last Name", "Email", "ID"};
		Object[][] data= {{"David",   "Beckham", "david.beckham@gmail.com", 1}, {"Gardiary", "Rukhiat", "gardiary@gmail.com", 2}, {"Zinedine", "Zidane", "zidane@hotmail.com", 3}};
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		//		************

		
		
		
		

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel(columnNames[0]);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(columnNames[1]);
		panel_2.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(columnNames[2]);
		panel_2.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model =  (DefaultTableModel) table.getModel();
				User newuser = new User(textField.getText(),textField_1.getText(),textField_2.getText(),id++);
				model.addRow(new Object []{textField.getText(),textField_1.getText(),textField_2.getText(),id++});
			}
		});
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4);
		model = new DefaultTableModel(data, columnNames);
		
		scrollPane = new JScrollPane();
		panel_4.add(scrollPane);
		
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
	}

	// create a class User and use it to populate the arraylist
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
		
		// create a list of users
//		public ArrayList ListUsers() {
//			ArrayList<User> list = new ArrayList<User>();
//			User u1 = new User("David", "Beckham", "david.beckham@gmail.com", 1);
//	        User u2 = new User("Gardiary", "Rukhiat", "gardiary@gmail.com", 2);
//	        User u3 = new User("Zinedine", "Zidane", "zidane@hotmail.com", 3);
//	        list.add(u1);
//	        list.add(u2);
//	        list.add(u3);
//	        return list;
	//		Object[][] data = new Object[row][col];
	//		for(int i = 0 ; i < row; i++) {
	//	         for(int j = 0; j < col; j++) {
	//	                 data[i][j] = arrayList.get(k);
	//	                 k++;
	//	                 if(k > arrayList.size()) {
	//	                     break;
	//	                 }
	//	         }
	//	     }
//		
//}
//		
//		public void addRowToJTable()
//	    {
//	        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//	        ArrayList<User> list = ListUsers();
//	        Object rowData[] = new Object[(list.size()+1)];
//	        for(int i = 0; i < list.size(); i++)
//	        {
//	            rowData[0] = list.get(i).id;
//	            rowData[1] = list.get(i).fname;
//	            rowData[2] = list.get(i).lname;
//	            rowData[3] = list.get(i).email;
//	            model.addRow(rowData);
//	        }
	                
//	    }	
	
	
	  // Variables declaration - do not modify                     
 
    // End of variables declaration      	
}
