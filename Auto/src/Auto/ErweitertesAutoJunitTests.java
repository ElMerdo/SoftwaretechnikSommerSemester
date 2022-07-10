package Auto;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import Auto.EinfachesAuto.FalscheErstzulassungsAusnahme;

@ExtendWith(MockitoExtension.class)
class ErweitertesAutoJunitTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Mock
	private ErweitertesAuto mockedAuto;

	@Test
	void MeldungUnfallautoLiefertKorrektenStringBeiKeinUnfallfahrzeug() {
		ErweitertesAuto junitAuto = new ErweitertesAuto("Junit", "Cabrio", "Permutt", 1999, 510, 0, "Berlin",
				"JunitCabrio", false);
		String result = junitAuto.MeldungUnfallfahrzeug(junitAuto.getIstUnfallfahrzeug());
		assertEquals("\n Das Fahrzeug ist kein Unfallfahrzeug", result);
	}

	@Test
	void MeldungUnfallautoLiefertKorrektenStringBeiUnfallfahrzeug() {
		ErweitertesAuto junitAuto = new ErweitertesAuto("Junit", "Cabrio", "Permutt", 1999, 510, 0, "Berlin",
				"JunitCabrio", true);
		String result = junitAuto.MeldungUnfallfahrzeug(junitAuto.getIstUnfallfahrzeug());
		assertEquals("\n Das Fahrzeug ist ein Unfallfahrzeug", result);
	}
	
	

	@Test
	void Ctor() {
		ErweitertesAuto junitAuto = new ErweitertesAuto("Junit", "Cabrio", "Permutt", 1999, 510, 0, "Berlin",
				"JunitCabrio", false);
		assertEquals("Junit", junitAuto.getBesitzer());
		assertEquals("JunitCabrio", junitAuto.getFahrgestellnummer());
		assertEquals("Berlin", junitAuto.getStandort());
		assertEquals("Cabrio", junitAuto.getAutotyp());
	    assertEquals("Permutt", junitAuto.getFarbe());
		assertEquals(false, junitAuto.getIstUnfallfahrzeug());
		try {
			assertEquals(23, junitAuto.getAlter());
		} catch (FalscheErstzulassungsAusnahme e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(510, junitAuto.getLeistung());
		assertEquals(0, junitAuto.getKmStand());
	}
	@Test
	void MockTest() {
		Mockito.when(mockedAuto.MeldungUnfallfahrzeug(false)).thenReturn("Unfallwagen");
		mockedAuto.MeldungUnfallfahrzeug(false);
		assertEquals(mockedAuto.MeldungUnfallfahrzeug(false), "Unfallwagen");
	}
}
