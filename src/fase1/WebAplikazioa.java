package fase1;

import java.io.IOException;
import java.util.Scanner;

public class WebAplikazioa {


	public static void main(String[] args) throws IOException {
		//  SORTU ETA HASIERATU HIZTEGIA (Singleton)
		//  SORTU ETA HASIERATU INTERNET (Singleton)
		
		
		
		
		int aukera = 1;
		Scanner sc = new Scanner(System.in);
		String hitza;
		while(aukera!=0) {
			System.out.println("Zer egin nahi duzu?");
			System.out.println("1. Web-orriak bilatu gako-hitzen bidez");
			System.out.println("0. Irten");
			aukera = Integer.parseInt(sc.nextLine());
			switch(aukera) {
			case 1: System.out.println("Sartu gako-hitz bat:");			        
			        hitza=sc.nextLine();
				// OSATU
				
				
				
				    break;
			default: break;
			}
		}
		sc.close();

	}

}