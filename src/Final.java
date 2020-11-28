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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class Final extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final frame = new Final();
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
	public Final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 346);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(123, 104, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookedTicket = new JLabel("PAYMENT METHOD");
		lblBookedTicket.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblBookedTicket.setBounds(181, 11, 227, 34);
		contentPane.add(lblBookedTicket);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(58, 60, 64, 19);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(201, 61, 219, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("CREDIT CARD");
		rdbtnCreditCard.setBackground(new Color(123, 104, 238));
		rdbtnCreditCard.setBounds(201, 110, 109, 23);
		contentPane.add(rdbtnCreditCard);
		
		JRadioButton rdbtnDebitCard = new JRadioButton("DEBIT CARD");
		rdbtnDebitCard.setBackground(new Color(123, 104, 238));
		rdbtnDebitCard.setBounds(332, 110, 109, 23);
		contentPane.add(rdbtnDebitCard);
		
		ButtonGroup btn=new ButtonGroup();
        btn.add(rdbtnCreditCard);
        btn.add(rdbtnDebitCard);
		
		JLabel lblCardNo = new JLabel("CARD NO.");
		lblCardNo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblCardNo.setBounds(58, 168, 94, 14);
		contentPane.add(lblCardNo);
		
		JLabel lblTypeOfCard = new JLabel("TYPE OF CARD");
		lblTypeOfCard.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblTypeOfCard.setBounds(58, 114, 109, 19);
		contentPane.add(lblTypeOfCard);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 166, 219, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPromoCode = new JLabel("PROMO CODE*");
		lblPromoCode.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblPromoCode.setBounds(58, 215, 109, 14);
		contentPane.add(lblPromoCode);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 213, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPay = new JButton("PAY");
		btnPay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnPay.setBounds(242, 271, 89, 23);
		contentPane.add(btnPay);
		
	}
}
