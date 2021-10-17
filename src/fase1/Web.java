package fase1;

import java.util.ArrayList;

public class Web {
	private int index;
	private String url;
	private ArrayList<Integer> estekaLista;

	public Web(int i,String pUrl) {
		this.index=i;
		this.url=pUrl;
		this.estekaLista=new ArrayList<Integer>();
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
}