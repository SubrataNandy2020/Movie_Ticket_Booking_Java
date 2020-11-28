import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class SANJU extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SANJU frame = new SANJU();
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
	public SANJU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 356);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHindid = new JLabel("HINDI 2D");
		lblHindid.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblHindid.setBounds(179, 11, 123, 17);
		contentPane.add(lblHindid);
		
		JRadioButton rdbtnam = new JRadioButton("09:00AM");
		rdbtnam.setBackground(new Color(0, 255, 255));
		rdbtnam.setBounds(35, 111, 79, 23);
		contentPane.add(rdbtnam);
		
		JRadioButton rdbtnam_1= new JRadioButton("11:00AM");
		rdbtnam_1.setBackground(new Color(0, 255, 255));
		rdbtnam_1.setBounds(135, 111, 79, 23);
		contentPane.add(rdbtnam_1);
		
		JRadioButton rdbtnpm = new JRadioButton("2:00PM");
		rdbtnpm.setBackground(new Color(0, 255, 255));
		rdbtnpm.setBounds(228, 111, 109, 23);
		contentPane.add(rdbtnpm);
		
		JRadioButton rdbtnpm_1 = new JRadioButton("04:00PM");
		rdbtnpm_1.setBackground(new Color(0, 255, 255));
		rdbtnpm_1.setBounds(35, 137, 79, 23);
		contentPane.add(rdbtnpm_1);
		
		JRadioButton rdbtnpm_2 = new JRadioButton("06:00PM");
		rdbtnpm_2.setBackground(new Color(0, 255, 255));
		rdbtnpm_2.setBounds(135, 137, 79, 23);
		contentPane.add(rdbtnpm_2);
		  
		
		    
		    JRadioButton rdbtnNewRadioButton = new JRadioButton("RDB Cinemas:SALT LAKE,KOLKATA");
		    rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		    rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		    rdbtnNewRadioButton.setBounds(14, 77, 323, 31);
		    contentPane.add(rdbtnNewRadioButton);
		    
		    JRadioButton rdbtnpm_3 = new JRadioButton("08:00PM");
		    rdbtnpm_3.setBackground(new Color(0, 255, 255));
		    rdbtnpm_3.setBounds(228, 137, 109, 23);
		    contentPane.add(rdbtnpm_3);
		    
		    JRadioButton rdbtnBioscopeaxisMallrajarhat = new JRadioButton("Bioscope:Axis Mall,Rajarhat");
		    rdbtnBioscopeaxisMallrajarhat.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		    rdbtnBioscopeaxisMallrajarhat.setBackground(new Color(0, 255, 255));
		    rdbtnBioscopeaxisMallrajarhat.setBounds(14, 176, 284, 27);
		    contentPane.add(rdbtnBioscopeaxisMallrajarhat);
		    
		    JRadioButton radioButton = new JRadioButton("09:00AM");
		    radioButton.setBackground(Color.CYAN);
		    radioButton.setBounds(35, 206, 69, 23);
		    contentPane.add(radioButton);
		    
		    JRadioButton radioButton_1 = new JRadioButton("2:00PM");
		    radioButton_1.setBackground(Color.CYAN);
		    radioButton_1.setBounds(135, 206, 69, 23);
		    contentPane.add(radioButton_1);
		    
		    JRadioButton rdbtnpm_4 = new JRadioButton("06:30PM");
		    rdbtnpm_4.setBackground(Color.CYAN);
		    rdbtnpm_4.setBounds(35, 232, 69, 23);
		    contentPane.add(rdbtnpm_4);
		    
		    JRadioButton rdbtnpm_5 = new JRadioButton("09:30PM");
		    rdbtnpm_5.setBackground(new Color(0, 255, 255));
		    rdbtnpm_5.setBounds(135, 232, 69, 23);
		    contentPane.add(rdbtnpm_5);
		    
		    ButtonGroup group1 = new ButtonGroup();
		    group1.add(rdbtnNewRadioButton);
		    group1.add(rdbtnBioscopeaxisMallrajarhat);
		    getContentPane().add(rdbtnNewRadioButton);
		    
		    
		    
		    	ButtonGroup group = new ButtonGroup();
		    group.add(rdbtnam);
		    group.add(rdbtnam_1);
		    group.add(rdbtnpm_1);
		    group.add(rdbtnpm);
		    group.add(rdbtnpm_2);
		    group.add(rdbtnpm_3);
		    
		    	group.add(rdbtnpm_5);
		    	group.add(rdbtnpm_4);
		    	group.add(radioButton_1);
		    	group.add(radioButton);
		    	
		    	JLabel lblDate = new JLabel("Date");
		    	lblDate.setFont(new Font("Times New Roman", Font.BOLD, 16));
		    	lblDate.setBounds(24, 41, 46, 14);
		    	contentPane.add(lblDate);
		    	
		    	JButton btnNext = new JButton("NEXT");
		    	
		    	  btnNext.addActionListener(new ActionListener() {
		  			
		  			
		  			public void actionPerformed(ActionEvent arg0) {
		  				dispose();
		  				JFrame frame=new Seats();				
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
		    	btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		    	btnNext.setBounds(87, 283, 89, 23);
		    	contentPane.add(btnNext);
		    	
		    	JDateChooser dateChooser = new JDateChooser();
		    	dateChooser.setBounds(99, 39, 91, 20);
		    	contentPane.add(dateChooser);
		    	
		    	JButton btnBack = new JButton("BACK");
		    	btnBack.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		    	 btnBack.addActionListener(new ActionListener() {
						
						
						public void actionPerformed(ActionEvent arg0) {
							dispose();
							JFrame frame=new AfterSignIn();				
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
		    	btnBack.setBounds(275, 283, 89, 23);
		    	contentPane.add(btnBack);
		    	
		    
		    	
		
	}
}
