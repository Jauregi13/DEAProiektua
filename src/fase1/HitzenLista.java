package fase1;

import java.util.ArrayList;

public class HitzenLista {
	private ArrayList<Hitza>lista= new ArrayList<Hitza>();
	/**
	 * Hitz bat gehitzen dio listari
	 * @param hitza: gehitzen den hitza
	 */
	public void hitzaGehitu(Hitza hitza) {
		lista.add(hitza);	}
	/**
	 * Emandako stringa bilatzen du hitzen listan eta dagokion hitza itzultzen du
	 * @param s: bilatu nahi den hitzaren testua (stringa)
	 * @return s stringari dagokion hitza (listan badago), null bestela
	 */
	public Hitza hitzaBilatu(String s) {
		for (int i=0;i<lista.size();i++) {
			if(lista.get(i).getHitz()==s) {
				return lista.get(i);
			}
		}
		return null;
		
	}
	public ArrayList<Hitza> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Hitza> lista) {
		this.lista = lista;
	}
}

