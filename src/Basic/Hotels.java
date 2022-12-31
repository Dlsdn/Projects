package Basic;

public class Hotels {
	
	 private Hotels() {}
	 
	 public static Hotels getInstance()
	 {
		 if(instance == null)
		 {
			 instance = new Hotels();
		 }
		 
		 return instance;
	 }
	 
	 public void finalConfirm(String _name, String _address, String _number, String _date,
			 				String _room, int _personCnt) 
	 {
		 m_hotelName = _name;
		 m_hotelAdr  = _address;
		 m_hotelNum  = _number;
		 m_date 	 = _date;
		 m_room 	 = _room;
		 m_personCnt = _personCnt;
	 }
	 
	 public final String HotelsName()  		{ return m_hotelName; }
	 public final String HotelsAdr() 		{ return m_hotelAdr; }
	 public final String HotelsNum()  		{ return m_hotelNum; }
	 public final String HotelsDate()  		{ return m_date; }
	 public final String HotelsRoom()  		{ return m_room; }
	 public final int HotelsPersonCnt()  	{ return m_personCnt; }
	 
	 
	 
	 // Hotel varivable
	 private static Hotels instance;
	 private String m_hotelName;
	 private String m_hotelAdr;
	 private String m_hotelNum;
	 private String m_date;
	 private String m_room;
	 private int 	m_personCnt;
}
