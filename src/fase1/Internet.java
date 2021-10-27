package fase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Internet {
	private static Internet nireInternet=null;
	private WebenLista webList;

	private Internet() {
		this.webList=new WebenLista();
	}
	public static Internet getInstance(){
		if(nireInternet==null) 
			nireInternet=new Internet();
		return nireInternet;
	}
	
	public WebenLista getLista() {
		return this.webList;
	}
	/**
	 * Pasatako fitxategian dauden webak kargatzen ditu
	 * @param fitxIzena: webak dauzkan fitxategiaren izena
	 * @throws FileNotFoundException 
	 */
	private void webakKargatu(String fitxIzena) throws FileNotFoundException {
		File f=new File(fitxIzena);
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String webberria=sc.nextLine();
			String[] parts=webberria.split("\\s+");
			int index=Integer.parseInt(parts[1]);
			Web web= new Web(index,parts[0]);
			this.webList.webaErantsi(web);
		}
		sc.close();
	}
	// Ikusi hurrengo ataleko laguntza
	/**
	 * Pasatako fitxategian dauden estekak kargatzen ditu
	 * @param fitxIzena: estekak dauzkan fitxategiaren izena
	 * @throws FileNotFoundException 
	 */
	private void estekakKargatu(String fitxIzena) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fitxIzena));
		while(sc.hasNextLine()) {
			String estberria=sc.nextLine();
			String[] pfitxIzena=estberria.split("\\s+");
			int indexJatorri=Integer.parseInt(pfitxIzena[0]);
			int indexHelmuga=Integer.parseInt(pfitxIzena[1]);
			this.webList.estekaErantsi(indexJatorri, indexHelmuga);
		}
		sc.close();
	}
	// Ikusi hurrengo ataleko laguntza
	/**
	 * Klasea hasieratzen du: horretarako web-orriak eta estekak kargatzen ditu
	 * @param webenFitxIzena: webak dauzkan fitxategiaren izena
	 * @param estekenFitxIzena: estekak dauzkan fitxategiaren izena
	 * @throws FileNotFoundException 
	 */
	public void hasieratu(String webenFitxIzena, String estekenFitxIzena) throws FileNotFoundException {
		this.webakKargatu(webenFitxIzena);
		this.estekakKargatu(estekenFitxIzena);

	}
	/**
	 * Hitz bati dagokion stringa emanda, pantailan inprimatzen ditu
	 * gako-hitz hori duten webak
	 * @param s: hitzari dagokion stringa
	 */
	public void webBilatzailea(String s) {
		
		System.out.println(s+":");
		Hitza hitz = new Hitza(s);
		
		if(hitz.getSize()>=4 && hitz.getSize()<=10) {
			for(int i=0;i<this.webList.getLista().size();i++) {
				Web w=this.webList.getLista().get(i);
				for (int j=0;j<w.getGakoak().size();j++) {
					if(w.gakoaDa(hitz)) {
						hitz =w.getGakoak().get(j);
						for(int k=0;k<hitz.getHWebList().size();k++) {
							System.out.println("        -"+hitz.getHWebList().get(k).getUrl());
						}
					}
				}
			}
		}else {
			System.out.println("Hitza Txikiegia edo haundiegia da. 4-10 tarteko bat jarri mesedez");
		}
	}
}
