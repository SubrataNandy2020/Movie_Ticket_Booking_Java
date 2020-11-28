import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StringContent;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;


public class AfterSignIn extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterSignIn frame = new AfterSignIn();
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
	public AfterSignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		setSize(1366,768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//setResizable(false);
		contentPane.setLayout(null);
		
		JLabel lblWlecomeToMovie = new JLabel("Wlecome to MOVIE TICKETING");
		lblWlecomeToMovie.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 30));
		lblWlecomeToMovie.setBounds(441, 0, 489, 79);
		contentPane.add(lblWlecomeToMovie);
		
		
		
		JButton btnNewButton = new JButton("");
		Image img1=new ImageIcon(this.getClass().getResource("/Sanju.jpeg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		  btnNewButton.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					JFrame frame=new SANJU();				
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
		btnNewButton.setBounds(83, 128, 312, 469);
		contentPane.add(btnNewButton);
		
		JLabel lblSanju = new JLabel("SANJU");
		lblSanju.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSanju.setBounds(171, 623, 80, 24);
		contentPane.add(lblSanju);
		
		JButton button = new JButton("");
		Image img2=new ImageIcon(this.getClass().getResource("/Incredibles2.jpg")).getImage();
		button.setIcon(new ImageIcon(img2));
		 button.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					JFrame frame=new English();				
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
		button.setBounds(507, 128, 312, 469);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("");
		Image img3=new ImageIcon(this.getClass().getResource("/Race3.jpeg")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img3));
		 btnNewButton_1.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					JFrame frame=new SANJU();				
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
		btnNewButton_1.setBounds(962, 128, 312, 467);
		contentPane.add(btnNewButton_1);
		
		JLabel lblIncredibles = new JLabel("INCREDIBLES 2");
		lblIncredibles.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblIncredibles.setBounds(585, 617, 182, 37);
		contentPane.add(lblIncredibles);
		
		
		JLabel lblRace = new JLabel("RACE 3");
		lblRace.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblRace.setBounds(1096, 628, 89, 14);
		contentPane.add(lblRace);
		
		JButton btnNext = new JButton("NEXT");
        btnNext.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame frame=new Next();				
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
		
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNext.setBounds(611, 682, 89, 23);
		contentPane.add(btnNext);
		
		
		
	
}
}
