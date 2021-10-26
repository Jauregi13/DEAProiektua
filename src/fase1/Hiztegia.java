package fase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hiztegia {
	private static Hiztegia nireHiztegia;
	private HitzenLista list;;
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
        	String h_=sc.nextLine();
        	Hitza h=new Hitza(h_);
        	this.list.hitzaGehitu(h);
        }
        sc.close();
	}

	/**
	 * Hiztegiko hitz bakoitzari erreferentziatzen dituen web-orriak
	 * esleitzen zaizkio
	 * Aurre: Internet eta hiztegia kargatuta daude jadanik
	 */
	private void hitzenWebakKonputatu() {
		for (int i=0;i<this.list.getLista().size();i++) {
			System.out.println(this.list.getLista().get(i)+" :");
			for (int j=0;j<this.list.getLista().get(i).getHWebList().size();j++)
				System.out.println("       *"+this.list.getLista().get(i).getHWebList().get(j));
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
