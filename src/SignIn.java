import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oracle.jdbc.pool.OracleDataSource;
import oracle.net.aso.p;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEnter;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textField.setBounds(205, 94, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblUserName.setBounds(69, 94, 104, 20);
		contentPane.add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(70, 145, 90, 20);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(205, 147, 111, 20);
		contentPane.add(passwordField);
		
		JLabel lblUserLogin = new JLabel("USER LOGIN ");
		lblUserLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblUserLogin.setBounds(137, 21, 166, 20);
		contentPane.add(lblUserLogin);
		
		btnEnter = new JButton("ENTER");
   btnEnter.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				OracleDataSource ods;
				try {
					ods=new OracleDataSource();
				ods.setURL("jdbc:oracle:thin:SUBRATA/subrata@localhost:1521/XE");
		        Connection con= ods.getConnection();
				String sql="select email,password from moviedata where email=? and password=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, textField.getText());
				ps.setString(2,passwordField.getText());
			    ResultSet rs=ps.executeQuery();
				if(rs.equals(rs.next())) {
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFULLY");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"LOGIN FAILED");
					
				}
			}
				catch(SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					JOptionPane.showMessageDialog(null,e);
					
				}
				
			}
		});
		btnEnter.setBounds(81, 212, 89, 23);
		contentPane.add(btnEnter);
		
		btnBack = new JButton("BACK");
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
		btnBack.setBounds(247, 212, 89, 23);
		contentPane.add(btnBack);
	}
}
