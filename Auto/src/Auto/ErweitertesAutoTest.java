package Auto;

import Auto.EinfachesAuto.FalscheErstzulassungsAusnahme;

public class ErweitertesAutoTest {
	public static void main(String[] args) {
				
		try {
			ErweitertesAuto pkw1 = new ErweitertesAuto("Hans2", "SUV", "Gr�n", 2010, 160, 80000, "Berlin", "S12U34V56", false);
			pkw1.meldung();
			pkw1.MeldungUnfallfahrzeug();
			System.out.print(". Das Auto ist " + pkw1.getAlter() + " Jahre alt.\n");
			System.out.println(pkw1.toString());
			System.out.println("Aktueller Kilometerstand: " + pkw1.getKmStand());
			pkw1.SetzeNeuesZiel("M�nchen", 700);
			System.out.println("Neuer Kilometerstand: " + pkw1.getKmStand() + " Neuer Standort: " + pkw1.getStandort());
		} catch (FalscheErstzulassungsAusnahme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		ErweitertesAuto pkw3 = new ErweitertesAuto("Micha2", "Kleinwagen", "Grau", 2017, 70, 20, "Hamburg", "K12L34E56I78N90", true);
		try {
			System.out.println("\n\n Nun kommt der " + pkw3.getFarbe() + "e " + pkw3.getAutotyp() + " von " + pkw3.getBesitzer());
			pkw3.meldung();
			System.out.print(". Das Auto ist " + pkw3.getAlter() + " Jahre alt\n");
			pkw3.MeldungUnfallfahrzeug();
		} catch (FalscheErstzulassungsAusnahme e) {
			e.printStackTrace();
		}
		System.out.println(pkw3.toString());
		System.out.println("Aktueller Kilometerstand: " + pkw3.getKmStand());
		pkw3.SetzeNeuesZiel("Hamburg", 300);
		System.out.println("Neuer Kilometerstand: " + pkw3.getKmStand() + " Neuer Standort: " + pkw3.getStandort());

		System.out.println();
		System.out.println("Projekt von Merdan Erdogan");
	}
}

