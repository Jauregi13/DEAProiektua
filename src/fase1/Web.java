package fase1;

import java.util.ArrayList;

public class Web {
	private int index;
	private String url;
	private ArrayList<Integer> estekaLista;
	private ArrayList<Hitza>  gakoak;

	public Web(int i,String pUrl) {
		this.index=i;
		this.url=pUrl;
		this.estekaLista=new ArrayList<Integer>();
		this.gakoak=new ArrayList<Hitza>();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void addEsteka(int est) {
		this.estekaLista.add(est);
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public ArrayList<Integer> getEstekaLista() {
		return estekaLista;
	}
	public void setEstekaLista(ArrayList<Integer> estekaLista) {
		this.estekaLista = estekaLista;
	}
	public boolean gakoaDa(Hitza h) {
		boolean gakoa=false;
		if(h.getSize()>=4 && h.getSize()<=10) {
			if(this.getUrl().contains(h.getHitz())) {
				this.gakoak.add(h);
				h.addGakoHitz(this);
				gakoa=true;
			}
		}
		return gakoa;
	}
	public ArrayList<Hitza> getGakoak() {
		return gakoak;
	}
	public void setGakoak(ArrayList<Hitza> gakoak) {
		this.gakoak = gakoak;
	}
}