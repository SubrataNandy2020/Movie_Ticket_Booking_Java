import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class Create extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Create frame = new Create();
					frame.setVisible(true);
					
					Toolkit t=Toolkit.getDefaultToolkit();
					 Dimension d = t.getScreenSize();
					 int width=frame.getWidth();
					 int height=frame.getHeight();
					 int x=(d.width -width)/2;
					 int y=(d.height- height)/2;
					 frame.setLocation(x,y);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 318);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateAccount = new JLabel("CREATE ACCOUNT");
		lblCreateAccount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblCreateAccount.setBounds(162, 11, 188, 24);
		contentPane.add(lblCreateAccount);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblFirstName.setBounds(63, 60, 72, 24);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblLastName.setBounds(63, 95, 72, 26);
		contentPane.add(lblLastName);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblEmailId.setBounds(63, 132, 72, 24);
		contentPane.add(lblEmailId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPassword.setBounds(63, 167, 72, 24);
		contentPane.add(lblPassword);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblMobileNo.setBounds(63, 204, 72, 24);
		contentPane.add(lblMobileNo);
		
		textField = new JTextField();
		textField.setBounds(181, 63, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 99, 108, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(181, 135, 108, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 170, 108, 20);
		contentPane.add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(181, 207, 108, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				OracleDataSource ods;
				try {
					ods = new OracleDataSource();
					ods.setURL("jdbc:oracle:thin:SUBRATA/subrata@localhost:1521/XE");
			        Connection con= ods.getConnection();
			        String sql = "insert into moviedata values(?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,passwordField.getText());
					ps.setString(5,textField_3.getText());
					int res = ps.executeUpdate();
					if(res>0) {
					JOptionPane.showMessageDialog(null, "NEW USER ID INSERTED");
					}
					
						
						
				} 
					
				catch (SQLException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					JOptionPane.showMessageDialog(null, "USER ID NOT INSERTED");
					
				}
				
			}
		});
		btnCreate.setBounds(63, 245, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame frame=new First_Page();				
				frame.setVisible(true);
				Toolkit t=Toolkit.getDefaultToolkit();
				 Dimension d = t.getScreenSize();
				 int width=frame.getWidth();
				 int height=frame.getHeight();
				 int x=(d.width -width)/2;
				 int y=(d.height- height)/2;
				 frame.setLocation(x,y);
			}
		});
		btnBack.setBounds(243, 245, 89, 23);
		contentPane.add(btnBack);
	}
}
