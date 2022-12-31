package reservation;


import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Basic.Hotels;
import Basic.Macro;
import character.JejuTypeSelection;
import intro.JejuBase;


public class JejuReservation extends JPanel{
	
	public JejuReservation() {
				
	}
	
	public void Setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setVisible(true);
		
		// 추후 이미지 추가?
		backBtn = new JButton("Back");
		backBtn.setBounds(minicoordX, minicoordY, miniSizeX, miniSizeY);
		
		// For FrameDate
		m_date = new JejuDateFrame();
		
		add(backBtn);
		
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JejuBase.disposeInstance(new JejuReservation());
				
				JejuBase.getInstance(new JejuTypeSelection());
			}
		});
		
	
		hotelName();
		date();
		Bed();
		SetReserveBtn();
		HotelPicture();
		HotelAddress();
		HotelNumber();
		HotelDate();
	}
	
	private void hotelName()
	{
		JLabel hotelLabel = new JLabel(m_hotelName);
		hotelLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		hotelLabel.setBounds(hotelNameCoordX, hotelNameCoordY, hotelNameWidth, hotelNameHeight);
		add(hotelLabel);
	}
	
	
	private void date()
	{
		JButton dateButton = new JButton("Date");
		dateButton.setBounds(middleCoordX, middleCoordY, middleWidth, middleHeight);
		add(dateButton);
		
		dateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				m_date.Initialize(new GetSet_CheckDate());
			}
		});
		
	}
	
	
	private void Bed()
	{
		JButton Bedbtn = new JButton("Bed");
		Bedbtn.setBounds(middleCoordX + 90, middleCoordY, middleWidth, middleHeight);
		Bedbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.getInstance(new Bedbase());
				
			}
		});
		add(Bedbtn);
	}
	
	private void HotelPicture()
	{
		JLabel addLabel = new JLabel("picture");
		
		HotelpicRec = new Rectangle(30, 200, 200, 200);
		addLabel.setBounds(HotelpicRec);
		add(addLabel);
	}
	
	private void HotelAddress()
	{
		JLabel addLabel = new JLabel
				(
					"<html>"
				    + "Address <br/>"
					+ m_hotelAdr
					+ "<html>"
				);
		
		HoteladrRec = new Rectangle(30, 450, 200, 50);
		addLabel.setBounds(HoteladrRec);
		add(addLabel);
	}
	
	private void HotelNumber()
	{
		JLabel addLabel = new JLabel
				(
					"<html>"
				    + "Number <br/>"
					+ m_hotelNum
					+ "<html>"
				);
		HotelNumRec = new Rectangle(30, 500, 100, 50);
		addLabel.setBounds(HotelNumRec);
		add(addLabel);
	}
	
	private void SetReserveBtn()
	{
		reserveBtn = new JButton("Payment");
		reserveBtn.setBounds(minicoordX + miniDistanceX, minicoordY, miniSizeX, miniSizeY);
		reserveBtn.setVisible(true);
		
		add(reserveBtn);
		
		
		reserveBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(m_date.GetTotalDate().equals(""))
			{
				JOptionPane.showMessageDialog(null, "날짜를 입력해주세요");
				
			}
			else
			{
				JejuBase.disposeInstance(new JejuReservation());
				JejuBase.getInstance(new Payment());
			}
			
		}
	});
		
	}
	
	private void HotelDate()
	{
		JLabel addLabel = new JLabel
				(
					"<html>"
				    + "Date <br/>"
					+ m_date.GetTotalDate()
					+ "<html>"
				);
		HotelNumRec = new Rectangle(30, 600, 100, 50);
		addLabel.setBounds(HotelNumRec);
		add(addLabel);
	}
	
	
	 public void HotelsInfo(String _name, String _address, String _number)
	 {
		 m_hotelName = _name;
		 m_hotelAdr  = _address;
		 m_hotelNum  = _number;
	 }
	
	
	//=========BASIC VARIABLE========= 
	private JButton backBtn = null;
	private JButton reserveBtn = null;
	private int miniSizeX = 150;
	private int miniSizeY = 70;
	private int minicoordY = 650;
	private int minicoordX = 30;
	private int miniDistanceX = 370;
	
	// hottel label variable
	private int hotelNameCoordX = 50;
	private int hotelNameCoordY = 30;
	private int hotelNameWidth = 300;
	private int hotelNameHeight = 90;
	
	// hottel picture and address number
	private Rectangle HotelpicRec;
	private Rectangle HoteladrRec;
	private Rectangle HotelNumRec;
	
	// date and num variable
	private int middleCoordX = 50;
	private int middleCoordY = 130;
	private int middleWidth = 90;
	private int middleHeight = 40;
	
	// hotelInfo variable
	private String m_hotelName;
	private String m_hotelAdr;
	private String m_hotelNum;
	// ===================== Calendar Part =====================
	JejuDateFrame m_date;
	
	
	
	
}
