import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment = new JLabel("CONFIRMATION");
		lblPayment.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblPayment.setBounds(130, 11, 170, 42);
		contentPane.add(lblPayment);
		
		JLabel lblNoOfSeats = new JLabel("NO. OF SEATS");
		lblNoOfSeats.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNoOfSeats.setBounds(72, 79, 113, 21);
		contentPane.add(lblNoOfSeats);
		
		JLabel lblTypeOfSeat = new JLabel("TYPE OF SEAT");
		lblTypeOfSeat.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblTypeOfSeat.setBounds(72, 129, 113, 21);
		contentPane.add(lblTypeOfSeat);
		
		textField = new JTextField();
		textField.setBounds(212, 80, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnRs = new JRadioButton("Rs.150");
		rdbtnRs.setBackground(new Color(30, 144, 255));
		rdbtnRs.setBounds(212, 129, 59, 23);
		contentPane.add(rdbtnRs);
		
		JRadioButton rdbtnRs_1 = new JRadioButton("Rs.250");
		rdbtnRs_1.setBackground(new Color(30, 144, 255));
		rdbtnRs_1.setBounds(273, 129, 59, 23);
		contentPane.add(rdbtnRs_1);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 18));
		 btnNext.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					JFrame frame=new Final();				
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
		btnNext.setBounds(72, 207, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnBack.setBounds(273, 207, 89, 23);
		contentPane.add(btnBack);
	}
}
