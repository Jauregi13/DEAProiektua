package fase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hiztegia {
	
	private static Hiztegia nireHiztegia = null;
	private HitzenLista hitzLista;
	
	private Hiztegia(HitzenLista lista) {
		
		this.hitzLista = lista;
	}
	
	public static Hiztegia getInstance(HitzenLista lista) {
		if(nireHiztegia == null) {
			nireHiztegia = new Hiztegia(lista);
		}
		return nireHiztegia;
	}
	/**
	 * Hiztegia kargatzen du emandako fitxategitik
	 * @param fitxIzena: hiztegia daukan fitxategiaren izena
	 * @throws FileNotFoundException 
	 */
	private void hitzakKargatu(String fitxIzena) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fitxIzena));
		while(sc.hasNextLine()) {
			
			String hitza = sc.nextLine();
			Hitza hitzBerria = new Hitza(hitza);
			this.hitzLista.hitzaGehitu(hitzBerria);
		}
		
		sc.close();
		
	}

	/**
	 * Hiztegiko hitz bakoitzari erreferentziatzen dituen web-orriak
	 * esleitzen zaizkio
	 * Aurre: Internet eta hiztegia kargatuta daude jadanik
	 */
	private void hitzenWebakKonputatu() {
		
	}
	// Ikusi hurrengo ataleko laguntza
	/**
	 * Hiztegia kargatzen du emandako fitxategitik, eta hitz bakoitzaren webak
	 * konputatzen ditu (hitz bakoitzari erreferentziatzen dituen web-orriak
	 * esleitzen zaizkio)
	 * @param fitxIzena: hiztegia daukan fitxategiaren izena
	 * AURRE: Internet eta hiztegia kargatuta daude dagoeneko
	 */
	public void hasieratu(String fitxIzena) {
		
	}
	/**
	 * Emandako stringa bilatzen du hiztegian eta dagokion hitza itzultzen du
	 * @param s: bilatu nahi den hitzaren testua (stringa)
	 * @return s stringari dagokion hitza (hiztegian badago), null bestela
	 */
	public Hitza hitzaBilatu(String s) {
		
		Hitza hitza = this.hitzLista.hitzaBilatu(s);
		
		
		return hitza;
		
	}

}
