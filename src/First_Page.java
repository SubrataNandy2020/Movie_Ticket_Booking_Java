import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.ContentModel;

public class First_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_Page frame = new First_Page();
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
	public First_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    setResizable(false);
		JButton btnNewButton = new JButton("User SignIn");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame frame=new SignIn();				
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
		contentPane.setLayout(null);
		btnNewButton.setBounds(292, 260, 275, 59);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Create Account\r\n");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JFrame frame = new Create();
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
		btnNewButton_1.setBounds(292, 437, 275, 59);
		contentPane.add(btnNewButton_1);
		
		JLabel lblMovieTicketing = new JLabel("MOVIE TICKETING");
		lblMovieTicketing.setForeground(new Color(0, 0, 0));
		lblMovieTicketing.setFont(new Font("Algerian", Font.BOLD, 61));
		lblMovieTicketing.setBounds(117, 11, 736, 94);
		contentPane.add(lblMovieTicketing);
		
		JLabel label = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/movie1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(75, 59, 641, 501);
		contentPane.add(label);
	}

}
