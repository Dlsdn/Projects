package reservation;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;
import intro.JejuBase;
import java.awt.Color;
import java.awt.Font;

public class Payment extends JPanel { 
	JLabel img;
	JPanel panel_bottom;
	Button btn_back;
	Button btn_payment;
	TextArea text_info;
	
	public Payment() {
		Setting();
		ImgLabel();
		Info();
		Btn();	
	}

	public void Info() {
		GetSet_CheckDate g = new GetSet_CheckDate();
		text_info = new TextArea(
				"\n¡Ý Check In : " + g.getCheckInDate() + "\n\n" + 
				"¡Ý Check Out : " + g.getCheckOutDate() + "\n\n" +
				"¡Ý Hotel Name : " + "\n\n" + 
				"¡Ý How Many People : " + "\n\n" +
				"¡Ý Room Type : " + "\n\n"
				, 0, 0,TextArea.SCROLLBARS_NONE);
		text_info.setFont(new Font("Adobe °íµñ Std B", Font.BOLD | Font.ITALIC, 20));
		text_info.setBackground(Color.LIGHT_GRAY);
		text_info.setBounds(10, 354, 566, 259);
		add(text_info);
	}
	
	public void ImgLabel() {
		img = new JLabel();
		img.setBounds(109, 36, 367, 312);
		add(img);
	}
	
	public void  Btn() {
		panel_bottom = new JPanel();
		panel_bottom.setBounds(10, 647, 566, 122);
		add(panel_bottom);
		panel_bottom.setLayout(null);
		
		btn_back = new Button("Back");
		btn_back.setBounds(10, 10, 166, 83);
		panel_bottom.add(btn_back);
		btn_back.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new Payment());
				JejuBase.getInstance(new JejuReservation());
			}
		});
		
		btn_payment = new Button("Payment");
		btn_payment.setBounds(390, 10, 166, 83);
		panel_bottom.add(btn_payment);
		btn_payment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new PaymentFrame();
			}
		});
		
		
		setVisible(true);
	}

	public void Setting() {
		setSize(Macro.g_Width, Macro.g_Height);
		setLayout(null);

	}
}
