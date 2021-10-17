package fase1;

import java.util.ArrayList;

public class HitzenLista {
	
	private ArrayList<Hitza>lista;
	

	public HitzenLista() {
		
	}
	/**
	 * Hitz bat gehitzen dio listari
	 * @param hitza: gehitzen den hitza
	 */
	public void hitzaGehitu(Hitza hitza) {
		this.lista.add(hitza);
	}
	/**
	 * Emandako stringa bilatzen du hitzen listan eta dagokion hitza itzultzen du
	 * @param s: bilatu nahi den hitzaren testua (stringa)
	 * @return s stringari dagokion hitza (listan badago), null bestela
	 */
	public Hitza hitzaBilatu(String s) {
		
		for (Hitza hitza : lista) {
			
			if(hitza.equals(s)) {
				return hitza;
			}
		}
		
		return null;
		
	}
	
	public ArrayList<Hitza> getLista(){
		return this.lista;
	}
}
