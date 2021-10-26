package fase1;

import java.util.ArrayList;

public class Hitza {
	private ArrayList<Web> HWebList;
	private String Hitz;
	private int size;
	public Hitza(String pHitz) {
		this.HWebList= new ArrayList<Web>();
		this.Hitz=pHitz;
		this.size=this.Hitz.length();
	}
	public void addGakoHitz(Web e) {
		this.HWebList.add(e);
	}
	public int getSize() {
		return this.size;
	}
	public ArrayList<Web> getHWebList() {
		return HWebList;
	}
	public String getHitz() {
		return Hitz;
	}

}
