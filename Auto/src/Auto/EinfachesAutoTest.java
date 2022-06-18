package Auto;

import Auto.EinfachesAuto.FalscheErstzulassungsAusnahme;

public class EinfachesAutoTest {
	public static void main(String[] args) throws FalscheErstzulassungsAusnahme {
//		EinfachesAuto auto1 = new EinfachesAuto("Hans", "Coupe", "Schwarz Matt", 2019, 150, 5000);
//		EinfachesAuto auto2 = new EinfachesAuto("Peter", "Limousine", "Chrom", 2016, 300, 60000);
//		EinfachesAuto auto3 = new EinfachesAuto("Micha", "Cabriolet", "Rot", 2010, 200, 100000);
//		System.out.println("Auto 1 ist " + auto2.getAlter());
//		auto2.meldung();
//		System.out.println();
//		System.out.println("Auto 3 ist " + auto3.getAlter());
//		System.out.println("Projekt von Merdan Erdogan");

		
		try {
			EinfachesAuto einfachesAuto = new EinfachesAuto("Hans", "Coupe", "Schwarz Matt", 2029, 150, 5000);
			einfachesAuto.meldung();
			System.out.print(". Das Auto ist " + einfachesAuto.getAlter() + " Jahre alt.\n");
		} catch (FalscheErstzulassungsAusnahme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			EinfachesAuto einfachesAuto1 = new EinfachesAuto("Peter", "Limousine", "Chrom", 2016, 300, 60000);
			einfachesAuto1.meldung();
			System.out.print(". Das Auto ist " + einfachesAuto1.getAlter() + " Jahre alt.\n");
		} catch (FalscheErstzulassungsAusnahme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			EinfachesAuto einfachesAuto2 = new EinfachesAuto("Micha", "Cabriolet", "Rot", 2010, 200, 100000);
			einfachesAuto2.meldung();
			System.out.print(". Das Auto ist " + einfachesAuto2.getAlter() + " Jahre alt.");
		} catch (FalscheErstzulassungsAusnahme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Projekt von Merdan Erdogan");
	}
}
