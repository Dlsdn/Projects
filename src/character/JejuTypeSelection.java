package character;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Basic.Macro;
import intro.JejuBase;
import reservation.JejuReservation;

public class JejuTypeSelection extends JPanel {
	
	public JejuTypeSelection() {
		
		setting();
		Activity();
		Healing();
		DalcomDesert();
		
	}// constructor
	
	private void setting()
	{
		setLayout(null);
		setSize(Macro.g_Width, Macro.g_Height);
		setBackground(Color.white);
	}
	
	private void Activity()
	{
		
		ImageIcon select1 = new ImageIcon("./src/resource/banner/Activity.jpg");
		
		Macro.customization(select1, Macro.g_Width, sizeY);
		
		JButton btnselect1 = new JButton(select1);
		
		btnselect1.setBounds(coordX, coordY, Macro.g_Width, sizeY);
		add(btnselect1);
		
		btnselect1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuTypeSelection());
				jejuPlace = new JejuPlace();
				jejuPlace.Activity();
				JejuBase.getInstance(jejuPlace);
			}});
		
	}
	
	
	private void Healing()
	{
		ImageIcon healingImg = new ImageIcon("./src/resource/banner/Healing.jpg");
		
		Macro.customization(healingImg, Macro.g_Width, sizeY);
		JButton healingBtn = new JButton(healingImg);
		healingBtn.setBounds(coordX, coordY + distanceY, Macro.g_Width, sizeY);
		
		add(healingBtn);
		healingBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuTypeSelection());
				jejuPlace = new JejuPlace();
				jejuPlace.HealingTour();
				JejuBase.getInstance(jejuPlace);
			}
		});
	}
	
	private void DalcomDesert()
	{		
		ImageIcon cafeImg = new ImageIcon("./src/resource/banner/Cafe_Tour.jpg");
		Macro.customization(cafeImg, Macro.g_Width, sizeY);
		
		JButton desertBtn = new JButton(cafeImg);
		desertBtn.setBounds(coordX, coordY + (distanceY * 2), Macro.g_Width, sizeY);
		desertBtn.setFont(new Font("굴림", Font.ITALIC , 30));
		
		add(desertBtn);
		desertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JejuBase.disposeInstance(new JejuTypeSelection());
				
				JejuPlace place = new JejuPlace();
				place.CafeTour();
				JejuBase.getInstance(place);
			}
		});
	}
	



	
	// ==========================================
	
	
	// Activity variable
	private int sizeY = 194;
	private int coordX = 0;
	private int coordY = 150;
	private int distanceY = 200;
	// Healing variable
	// Healing variable
	private JejuPlace jejuPlace;
	// Desert variable

	
	
	
	
}// constructor





