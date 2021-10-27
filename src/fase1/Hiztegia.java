package fase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hiztegia {
	private static Hiztegia nireHiztegia;
	private HitzenLista list;
	/**
	 * Hiztegia kargatzen du emandako fitxategitik
	 * @param fitxIzena: hiztegia daukan fitxategiaren izena
	 */
	private Hiztegia() {
		this.list=new HitzenLista();
	}
	public static Hiztegia getInstance() {
		if(nireHiztegia==null)
			nireHiztegia= new Hiztegia();
		return nireHiztegia;
		
	}
	private void hitzakKargatu(String fitxIzena) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fitxIzena));
        while(sc.hasNextLine()) {
        	String h=sc.nextLine();
        	Hitza hitz=new Hitza(h);
        	this.list.hitzaGehitu(hitz);
        }
        sc.close();
	}

	/**
	 * Hiztegiko hitz bakoitzari erreferentziatzen dituen web-orriak
	 * esleitzen zaizkio
	 * Aurre: Internet eta hiztegia kargatuta daude jadanik
	 */
	private void hitzenWebakKonputatu() {
		
		Internet in = Internet.getInstance();
		WebenLista wLista = in.getLista();
		
		for (Hitza hitza : list.getLista()) {
			
			int c = hitza.getSize();
			
			if(c>=4) {
			
				for (Web web : wLista.getLista()) {
				
					for (int i = 0; i < web.getUrl().length()-c; i++) {
					
						int k = i+c;

							String webZatitu = web.getUrl().substring(i, k);
						 
							if(webZatitu.equals(hitza)) {
									web.gakoaDa(hitza);
							}
							k++;
					}
				}
			}
		}
	}
	// Ikusi hurrengo ataleko laguntza
	/**
	 * Hiztegia kargatzen du emandako fitxategitik, eta hitz bakoitzaren webak
	 * konputatzen ditu (hitz bakoitzari erreferentziatzen dituen web-orriak
	 * esleitzen zaizkio)
	 * @param fitxIzena: hiztegia daukan fitxategiaren izena
	 * AURRE: Internet eta hiztegia kargatuta daude dagoeneko
	 * @throws FileNotFoundException 
	 */
	public void hasieratu(String fitxIzena) throws FileNotFoundException {
		this.hitzakKargatu(fitxIzena);
		this.hitzenWebakKonputatu();
	}
	/**
	 * Emandako stringa bilatzen du hiztegian eta dagokion hitza itzultzen du
	 * @param s: bilatu nahi den hitzaren testua (stringa)
	 * @return s stringari dagokion hitza (hiztegian badago), null bestela
	 */
	public Hitza hitzaBilatu(String s) {
		Hitza h=null;
		for (int i=0;i<this.list.getLista().size();i++) {
			h=this.hitzaBilatu(s);
		}
		return h;
		
	}

}
