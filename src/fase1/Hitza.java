package fase1;

import java.util.ArrayList;

public class Hitza {
	private ArrayList<Web> HWebList;
	private String hitz;
	private int size;
	public Hitza(String pHitz) {
		this.HWebList= new ArrayList<Web>();
		this.hitz=pHitz;
		this.size=this.hitz.length();
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
		return hitz;
	}

}
