package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class LitreTest {

	@Test
	public void testToGallon() {
		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);
		assertEquals(litre.toGallon(), gallon);
	}
	
	@Test
	public void testToLitre() {
		Litre litre = new Litre(4.546);
		Gallon gallon = new Gallon(1);
		assertEquals(gallon.toLitre(), litre);
	}
	
	@Test
	public void testLitreToLitre() {
		Litre l = new Litre(1);
		assertEquals(new Litre(1).toLitre(), l.toLitre());
	}

	@Test
	public void testNotEqual() {
		Litre litre = new Litre(15);
												// TESTS CHANGED FROM:
		assertNotEquals(15, litre); 			// litre.equals("15");
		assertNotEquals(null, litre); 			// litre.equals(null);
		assertEquals(litre, litre); 			// litre.equals(litre);
		assertNotEquals(new Litre(10), litre); 	// litre.equals(new Litre(10));
	}

}
