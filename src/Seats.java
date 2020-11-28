import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.handler.MessageContext;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Seats extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seats frame = new Seats();
					//String seats =  JOptionPane.showInputDialog("Total No. of Seats");
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
	public Seats() {
		//double c=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 347);
	  
	
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblScreenHere = new JLabel("SCREEN HERE");
		lblScreenHere.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblScreenHere.setBounds(347, 523, 197, 48);
		contentPane.add(lblScreenHere);
		
		JLabel lblSeatingArrangement = new JLabel("SEATING ARRANGEMENT");
		lblSeatingArrangement.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblSeatingArrangement.setBounds(106, 0, 253, 40);
		contentPane.add(lblSeatingArrangement);
		
		JCheckBox checkBox = new JCheckBox("20");
		checkBox.setBounds(22, 72, 45, 23);
		contentPane.add(checkBox);
		
		
		JCheckBox checkBox_1 = new JCheckBox("19");
		checkBox_1.setBounds(88, 72, 45, 23);
		contentPane.add(checkBox_1);
		
		
		JLabel lblSeats = new JLabel("SEATS");
		lblSeats.setBounds(192, 51, 46, 14);
		contentPane.add(lblSeats);
		
		
		JCheckBox checkBox_2 = new JCheckBox("18");
		checkBox_2.setBounds(155, 72, 45, 23);
		contentPane.add(checkBox_2);
		
		
		
		JCheckBox checkBox_3 = new JCheckBox("17");
		checkBox_3.setBounds(218, 72, 45, 23);
		contentPane.add(checkBox_3);
		
		
		JCheckBox checkBox_4 = new JCheckBox("16");
		checkBox_4.setBounds(281, 72, 45, 23);
		contentPane.add(checkBox_4);
		
		
		
		JCheckBox checkBox_5 = new JCheckBox("15");
		checkBox_5.setBounds(357, 72, 45, 23);
		contentPane.add(checkBox_5);
		
		
		JCheckBox checkBox_6 = new JCheckBox("14");
		checkBox_6.setBounds(22, 110, 55, 23);
		contentPane.add(checkBox_6);
		
		
		JCheckBox checkBox_7 = new JCheckBox("13\r\n");
		checkBox_7.setBounds(88, 110, 45, 23);
		contentPane.add(checkBox_7);
		
		
		
		JCheckBox checkBox_8 = new JCheckBox("12");
		checkBox_8.setBounds(155, 110, 45, 23);
		contentPane.add(checkBox_8);
		
		
		
		JCheckBox checkBox_9 = new JCheckBox("11");
		checkBox_9.setBounds(218, 110, 45, 23);
		contentPane.add(checkBox_9);
		
		
		
		JCheckBox checkBox_10 = new JCheckBox("10");
		checkBox_10.setBounds(281, 110, 45, 23);
		contentPane.add(checkBox_10);
		
		
		JCheckBox checkBox_11 = new JCheckBox("9");
		checkBox_11.setBounds(357, 110, 45, 23);
		contentPane.add(checkBox_11);
		
		
		
		JCheckBox checkBox_12 = new JCheckBox("8");
		checkBox_12.setBounds(22, 136, 45, 23);
		contentPane.add(checkBox_12);
		
		
		
		JCheckBox checkBox_13 = new JCheckBox("7");
		checkBox_13.setBounds(88, 136, 45, 23);
		contentPane.add(checkBox_13);
		
		
		
		JCheckBox checkBox_14 = new JCheckBox("6");
		checkBox_14.setBounds(281, 136, 45, 23);
		contentPane.add(checkBox_14);
		
		
		
		JCheckBox checkBox_15 = new JCheckBox("5");
		checkBox_15.setBounds(357, 136, 45, 23);
		contentPane.add(checkBox_15);
		
		
		JCheckBox checkBox_16 = new JCheckBox("4");
		checkBox_16.setBounds(88, 162, 45, 23);
		contentPane.add(checkBox_16);
		
		
		JCheckBox checkBox_17 = new JCheckBox("3");
		checkBox_17.setBounds(22, 161, 45, 23);
		contentPane.add(checkBox_17);
		
		
		JCheckBox checkBox_18 = new JCheckBox("2");
		checkBox_18.setBounds(281, 162, 39, 23);
		contentPane.add(checkBox_18);
		
		
		JCheckBox checkBox_19 = new JCheckBox("1");
		checkBox_19.setBounds(357, 162, 45, 23);
		contentPane.add(checkBox_19);
		
		
		JCheckBox chckbxS = new JCheckBox("S1");
		chckbxS.setBounds(22, 199, 45, 23);
		contentPane.add(chckbxS);
		
		
		JCheckBox chckbxS_1 = new JCheckBox("S2");
		chckbxS_1.setBounds(88, 199, 45, 23);
		contentPane.add(chckbxS_1);
		
		
		JCheckBox chckbxS_2 = new JCheckBox("S3");
		chckbxS_2.setBounds(155, 199, 45, 23);
		contentPane.add(chckbxS_2);
		
		JCheckBox chckbxS_3 = new JCheckBox("S4");
		chckbxS_3.setBounds(218, 199, 45, 23);
		contentPane.add(chckbxS_3);
		
		
		JCheckBox chckbxS_4 = new JCheckBox("S5");
		chckbxS_4.setBounds(281, 199, 45, 23);
		contentPane.add(chckbxS_4);
		
		
		JCheckBox chckbxS_5 = new JCheckBox("S6");
		chckbxS_5.setBounds(358, 199, 55, 23);
		contentPane.add(chckbxS_5);
		
		
		JCheckBox chckbxS_6 = new JCheckBox("S7");
		chckbxS_6.setBounds(22, 227, 55, 23);
		contentPane.add(chckbxS_6);
		
		
		JCheckBox chckbxS_7 = new JCheckBox("S8");
		chckbxS_7.setBounds(88, 227, 45, 23);
		contentPane.add(chckbxS_7);
		
		
		JCheckBox chckbxS_8 = new JCheckBox("S9");
		chckbxS_8.setBounds(155, 227, 45, 23);
		contentPane.add(chckbxS_8);
		
		
		JCheckBox chckbxS_9 = new JCheckBox("S10");
		chckbxS_9.setBounds(218, 227, 45, 23);
		contentPane.add(chckbxS_9);
		
		
		JCheckBox chckbxS_10 = new JCheckBox("S11");
		chckbxS_10.setBounds(281, 225, 78, 23);
		contentPane.add(chckbxS_10);
		
		
		JCheckBox chckbxS_11 = new JCheckBox("S12");
		chckbxS_11.setBounds(357, 227, 55, 23);
		contentPane.add(chckbxS_11);

		
		
		JLabel lblScreenHere_1 = new JLabel("SCREEN HERE");
		lblScreenHere_1.setBounds(180, 257, 126, 14);
		contentPane.add(lblScreenHere_1);
		setResizable(false);
		
			
		JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
			
        	
        	
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JFrame frame=new Final();				
				frame.setVisible(true);
			
				

			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNext.setBounds(174, 282, 89, 23);
		contentPane.add(btnNext);
		

	}
}
