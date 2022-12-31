package intro;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Basic.Macro;

public class JejuJoinUs extends JPanel{
	
	public JejuJoinUs() {
		setSize(Macro.g_Width, Macro.g_Height);
		setLayout(null);
		setBackground(new Color(255, 140, 0));
		
		JLabel lblJoinus = new JLabel("Join Us!");
		lblJoinus.setBounds(165, 50, 300, 100);
		lblJoinus.setFont(new Font("굴림", Font.ITALIC, 60));
		
		JLabel lblag = new JLabel("약관 동의");
		lblag.setBounds(70, 175, 100, 60);
		lblag.setFont(new Font("굴림", Font.BOLD, 15));
		
		JPanel terms = new JPanel();
		terms.setLayout(null);
		terms.setBackground(new Color(255, 180, 0));
		terms.setBounds(50, 180, 500, 395);
		
		
		TextArea ta = new TextArea("개인정보처리방침\r\n"
				+ "\r\n"
				+ "[차례]\r\n"
				+ "1. 총칙\r\n"
				+ "2. 개인정보 수집에 대한 동의\r\n"
				+ "3. 개인정보의 수집 및 이용목적\r\n"
				+ "4. 수집하는 개인정보 항목\r\n"
				+ "5. 개인정보 자동수집 장치의 설치, 운영 및 그 거부에 관한 사항\r\n"
				+ "6. 목적 외 사용 및 제3자에 대한 제공\r\n"
				+ "7. 개인정보의 열람 및 정정\r\n"
				+ "8. 개인정보 수집, 이용, 제공에 대한 동의철회\r\n"
				+ "9. 개인정보의 보유 및 이용기간\r\n"
				+ "10. 개인정보의 파기절차 및 방법\r\n"
				+ "11. 아동의 개인정보 보호\r\n"
				+ "12. 개인정보 보호를 위한 기술적 대책\r\n"
				+ "13. 개인정보의 위탁처리\r\n"
				+ "14. 의겸수렴 및 불만처리\r\n"
				+ "15. 부 칙(시행일) \r\n"
				, 1000, 20);
		ta.setBounds(50, 225, 500, 350);
		ta.setBackground(new Color(255, 180, 0));
		
		JButton joinBtn = new JButton("JOIN");
		joinBtn.setBackground(new Color(255, 180, 0)); 
		joinBtn.setBounds(365, 650, 170, 50);
		joinBtn.setFont(new Font("굴림", Font.CENTER_BASELINE, 20));
		
		JButton cancelBtn = new JButton("CANCEL");
		cancelBtn.setBackground(new Color(255, 180, 0)); 
		cancelBtn.setBounds(65, 650, 170, 50);
		cancelBtn.setFont(new Font("굴림", Font.CENTER_BASELINE, 20));
		
		add(lblJoinus);
		add(ta);
		add(lblag);
		add(joinBtn);
		add(cancelBtn);
		add(terms);
		
		
		joinBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new JejuBegin());
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new JejuBegin());
			}
		});
		
	}

}
