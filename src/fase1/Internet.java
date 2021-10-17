package fase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Internet {
	private static Internet nireInternet=null;
	private WebenLista webList;
	
private Internet(WebenLista pwebList) {
		this.webList=pwebList;
	}
public static Internet getInstance(WebenLista pwebList){
	if(nireInternet==null) 
		nireInternet=new Internet(pwebList);
	return nireInternet;
}
	/**
	* Pasatako fitxategian dauden webak kargatzen ditu
	 * @param fitxIzena: webak dauzkan fitxategiaren izena
	 * @throws FileNotFoundException 
	 */
	private void webakKargatu(String fitxIzena) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fitxIzena));
        while(sc.hasNextLine()) {
        	String webberria=sc.nextLine();
		String[] pfitxIzena=webberria.split("/r");
		int index=Integer.parseInt(pfitxIzena[1]);
		Web web= new Web(index,pfitxIzena[0]);
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
		Scanner sc = new Scanner(new File("fitxIzena"));
        while(sc.hasNextLine()) {
        	String estberria=sc.nextLine();
		String[] pfitxIzena=estberria.split("/r");
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
		WebenLista wbl= new WebenLista();
		Internet inet=this.getInstance(wbl);
		inet.webakKargatu(webenFitxIzena);
		inet.estekakKargatu(estekenFitxIzena);
        
	}
	/**
	 * Hitz bati dagokion stringa emanda, pantailan inprimatzen ditu
	 * gako-hitz hori duten webak
	 * @param s: hitzari dagokion stringa
	 */
	 public void webBilatzailea(String s) {
		 
	 }
}
