package Auto;

public class ErweitertesAuto extends EinfachesAuto{

	private static String standort;
	private String fahrgestellnummer;
	
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
     
	public ErweitertesAuto(String besitzer, String autotyp, String farbe, int erstzulassung, int leistung,
			int kmStand, String standort, String fahrgestellnummer) {
		super(besitzer, autotyp, farbe, erstzulassung, leistung, kmStand);
		if (kmStand < 0) {
			throw new IllegalArgumentException();
		}
		ErweitertesAuto.standort = standort;
		this.fahrgestellnummer = fahrgestellnummer;
	}
	
	/**
     * Die Methode toString() dient zur Ausgabe der Objektattribute.
     * 
     * @return string1: String mit allen Objektattributen
     */
	
	public String toString() {
		String string1 = "Das Auto von " + EinfachesAuto.getBesitzer() + " in der Farbe " + EinfachesAuto.getFarbe() + " mit " + EinfachesAuto.getLeistung() +  
				         " PS und einen Kilometerstand von " + EinfachesAuto.getKmStand() + ". \r\nDie Erstzulassung war im Jahre " + EinfachesAuto.getErstzulassung() 
				         + ", das Auto steht am Standort " + standort + " mit der Fahrgestellnummer " + fahrgestellnummer + ".";
		return string1;
		
	}
	
	
	
	/**
     * Die Methode SetzteNeuesZiel() dient zur Ausgabe des alten und neuen Standorts
	 * und zur Ausgabe des neuen KmStands
     */
     
	public void SetzeNeuesZiel(String ziel, int entfernung) {
		System.out.println("Das Auto fährt von " + getStandort() + " nach " + ziel + ".");
		System.out.println("Die Entfernung beträgt " + entfernung + "km.");
		ErweitertesAuto.setKmStand(getKmStand() + entfernung);
		standort = ziel;
	}
}
