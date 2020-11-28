import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class Next extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Next frame = new Next();
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
	public Next() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1366,768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		Image img1=new ImageIcon(this.getClass().getResource("/Jurassic World_Fallen Kingdom.jpeg")).getImage();
		button.setIcon(new ImageIcon(img1));
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
		button.setBounds(33, 90, 365, 524);
		contentPane.add(button);
		
		JLabel label = new JLabel("Wlecome to MOVIE TICKETING");
		label.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(469, 11, 489, 79);
		contentPane.add(label);
		
		JLabel lblJurassicWorldFallen = new JLabel("JURASSIC WORLD: FALLEN KINGDOM");
		lblJurassicWorldFallen.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblJurassicWorldFallen.setBounds(33, 635, 358, 24);
		contentPane.add(lblJurassicWorldFallen);
		
		JButton button_1 = new JButton("");
		Image img2=new ImageIcon(this.getClass().getResource("/Dhadak.jpeg")).getImage();
		button_1.setIcon(new ImageIcon(img2));
		 button_1.addActionListener(new ActionListener() {
				
				
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
		button_1.setBounds(941, 151, 318, 467);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("DHADAK");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(1064, 639, 98, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		Image img3=new ImageIcon(this.getClass().getResource("/SKY.jpeg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img3));
		 btnNewButton.addActionListener(new ActionListener() {
				
				
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
		btnNewButton.setBounds(521, 174, 287, 442);
		contentPane.add(btnNewButton);
		
		JLabel lblSkyScrapper = new JLabel("SKY SCRAPPER");
		lblSkyScrapper.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSkyScrapper.setBounds(584, 643, 142, 16);
		contentPane.add(lblSkyScrapper);
		
		JButton btnPrevious = new JButton("PREVIOUS");
         btnPrevious.addActionListener(new ActionListener() {
			
			
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
		
		btnPrevious.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrevious.setBounds(599, 695, 152, 23);
		contentPane.add(btnPrevious);
	}
}
