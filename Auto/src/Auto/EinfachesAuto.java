package Auto;
import java.util.Calendar;

/**
 * Klasse zum Erzeugen von Auto Objekten.
 * 
 * @author Merdan Erdogan
 * @version 1
*/

public class EinfachesAuto {

    // Instanzvariablen
    private static String besitzer;
    private static String autotyp;
    private static String farbe;
    private static int erstzulassung;
    private static int leistung;
    private static int kmStand;

    public static String getBesitzer() {
		return besitzer;
	}

	public static void setBesitzer(String besitzer) {
		EinfachesAuto.besitzer = besitzer;
	}

	public static String getAutotyp() {
		return autotyp;
	}

	public static void setAutotyp(String autotyp) {
		EinfachesAuto.autotyp = autotyp;
	}

	public static String getFarbe() {
		return farbe;
	}

	public static void setFarbe(String farbe) {
		EinfachesAuto.farbe = farbe;
	}

	public static int getErstzulassung() {
		return erstzulassung;
	}

	public static void setErstzulassung(int erstzulassung) {
		EinfachesAuto.erstzulassung = erstzulassung;
	}

	public static int getLeistung() {
		return leistung;
	}

	public static void setLeistung(int leistung) {
		EinfachesAuto.leistung = leistung;
	}

	public static int getKmStand() {
		return kmStand;
	}

	public static void setKmStand(int kmStand) {
		EinfachesAuto.kmStand = kmStand;
	}

	/**
     * Konstruktor fuer die Klasse EinfachesAuto
     * 
     * @param besitzer
     *            Name des Autobesitzers
     * @param autotyp
     *            Typ des Autos
     * @param farbe
     *            Farbe des Autos
     * @param erstzulassung
     *            Jahreszahl der Autozulassung
     * @param leistung
     *            PS-Zahl des Autos
     * @param kmStand
     *            Kilometerstand des Autos
     */

    public EinfachesAuto(String besitzer, String autotyp, String farbe,
            int erstzulassung, int leistung, int kmStand) {
        EinfachesAuto.besitzer = besitzer;
        EinfachesAuto.autotyp = autotyp;
        EinfachesAuto.farbe = farbe;
        EinfachesAuto.erstzulassung = erstzulassung;
        EinfachesAuto.leistung = leistung;
        EinfachesAuto.kmStand = kmStand;
    }

    /**
     * Die Methode getAlter() dient zur Errechnung des Autoalters ueber die
     * Erstzulassung.
     * 
     * @return int: Alter des Autos
     * 
     * @throws FalscheErstzulassungsAusnahme 
     */
    public int getAlter() throws FalscheErstzulassungsAusnahme {
        // Ermittlung des aktuellen Jahres
        Calendar aktuellerKalender = Calendar.getInstance();
        int aktuellesJahr = aktuellerKalender.get(Calendar.YEAR);
        if (aktuellesJahr < EinfachesAuto .erstzulassung) {
			throw new FalscheErstzulassungsAusnahme();
		}
        return aktuellesJahr - EinfachesAuto.erstzulassung;
    }
    
    public class FalscheErstzulassungsAusnahme extends Exception {
    	
    	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public FalscheErstzulassungsAusnahme() {
    		super("Das Jahr der Erstzulassung ist falsch, es ist größer als das Aktuelle Kalenderjahr.");
    	}
    }

    /**
     * Die Methode meldung() gibt die Attribute "farbe" und "besitzer" auf der
     * Standardausgabe aus.
     */
    public void meldung() {
        System.out.print("Hier gruesst das " + EinfachesAuto.farbe + "e ");
        System.out.print("Auto von " + EinfachesAuto.besitzer);
    }
}

