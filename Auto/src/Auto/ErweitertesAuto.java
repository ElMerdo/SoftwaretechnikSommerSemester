package Auto;

public class ErweitertesAuto extends EinfachesAuto{

	private static String standort;
	private String fahrgestellnummer;
	private static boolean unfallfahrzeug; 

	public boolean getIstUnfallfahrzeug() {
		return unfallfahrzeug;
	}

	public void setUnfallfahrzeug(boolean unfallfahrzeug) {
		ErweitertesAuto.unfallfahrzeug = unfallfahrzeug;
	}
	
	public static String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		ErweitertesAuto.standort = standort;
	}

	public String getFahrgestellnummer() {
		return fahrgestellnummer;
	}

	public void setFahrgestellnummer(String fahrgestellnummer) {
		this.fahrgestellnummer = fahrgestellnummer;
	}

	/**
     * Konstruktor fuer die Klasse ErweitertesAuto
     * 
     * @param besitzer aus der Klasse EinfachesAuto
     *            Name des Autobesitzers
     * @param autotyp aus der Klasse EinfachesAuto
     *            Typ des Autos
     * @param farbe aus der Klasse EinfachesAuto
     *            Farbe des Autos
     * @param erstzulassung aus der Klasse EinfachesAuto
     *            Jahreszahl der Autozulassung
     * @param leistung aus der Klasse EinfachesAuto
     *            PS-Zahl des Autos
     * @param kmStand aus der Klasse EinfachesAuto
     *            Kilometerstand des Autos	
     * @param standort
     *            Standort des Autos
	 * @param fahrgestellnummer
     *            Fahrgestellnummer des Autos
     */
     
	public ErweitertesAuto(String besitzer, String autotyp, String farbe, int erstzulassung, 
		int leistung, int kmStand, String standort, String fahrgestellnummer, boolean unfallfahrzeug) {
		super(besitzer, autotyp, farbe, erstzulassung, leistung, kmStand);
		if (kmStand < 0) {
			throw new IllegalArgumentException();
		}
		ErweitertesAuto.standort = standort;
		this.fahrgestellnummer = fahrgestellnummer;
		ErweitertesAuto.unfallfahrzeug = unfallfahrzeug;
	}
	
	/**
     * Die Methode toString() dient zur Ausgabe der Objektattribute.
     * 
     * @return string1: String mit allen Objektattributen
     */
	
	public String toString() {
		String unfallfahrzeugString;
		if(unfallfahrzeug) {
			unfallfahrzeugString = "Das Fahrzeug ist ein Unfallfahrzeug";			
		} else {
			unfallfahrzeugString = "Das Fahrzeug ist kein Unfallfahrzeug";
		}
		
		return "Das Auto von " + EinfachesAuto.getBesitzer() + " in der Farbe " + EinfachesAuto.getFarbe() + " mit " + EinfachesAuto.getLeistung() +  
				         " PS und einen Kilometerstand von " + EinfachesAuto.getKmStand() + ". \r\nDie Erstzulassung war im Jahre " + EinfachesAuto.getErstzulassung() 
				         + ", das Auto steht am Standort " + standort + " mit der Fahrgestellnummer " + fahrgestellnummer + "." + unfallfahrzeugString;
		
		
	}
	
	public String MeldungUnfallfahrzeug(boolean unfallfahrzeug) {
		if(unfallfahrzeug) {
			return "\n Das Fahrzeug ist ein Unfallfahrzeug";
		} else {
			return "\n Das Fahrzeug ist kein Unfallfahrzeug";
		}
	}
	
	
	
	/**
     * Die Methode SetzteNeuesZiel() dient zur Ausgabe des alten und neuen Standorts
	 * und zur Ausgabe des neuen KmStands
     */
     
	public void SetzeNeuesZiel(String ziel, int entfernung) {
		System.out.println("Das Auto f�hrt von " + getStandort() + " nach " + ziel + ".");
		System.out.println("Die Entfernung betr�gt " + entfernung + "km.");
		ErweitertesAuto.setKmStand(getKmStand() + entfernung);
		standort = ziel;
	}
}
