package fase1;

import java.util.ArrayList;

public class WebenLista {
	private ArrayList<Web>lista;

	public WebenLista() {
		this.lista=new ArrayList<Web>();
	}
	/**
	 * Web bat gehitzen dio listari
	 * @param web: gehitzen den weba
	 * AURRE: web ez dago listan
	 */
	public void webaErantsi(Web web) {
		this.lista.add(web);
	}
	/**
	 * Listako web bati esteka bat eransten dio
	 * @param idJatorriWeba: Jatorriko webaren id-a
	 * @param idHelburuWeba: Helburuko webaren id-a
	 * AURRE: lista id-en arabera ordenatuta dago
	 * AURRE: idJatorriWeba eta idHelburuWeba id-a duten webak listan daude
	 */
	public void estekaErantsi(int idJatorriWeba, int idHelburuWeba) {
		for(int i=0;i<this.lista.size();i++) {
			if(this.lista.get(i).getIndex()==idJatorriWeba) {
				this.lista.get(i).addEsteka(idHelburuWeba);
			}
		}
	}
}

