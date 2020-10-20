package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GallonTest {


	@Test
	public void testToLitre() {
		Gallon g = new Gallon(1);
		Litre l = new Litre(4.546);
		assertEquals(g.toLitre(),l);
	}
	
	@Test
	public void testEquals() {
		Gallon g1 = new Gallon(1);
		Gallon g2 = new Gallon(1);
		assertEquals(g2, g1);
	}
	
	@Test
	public void testNotEquals() {
		Gallon g1 = new Gallon(1);
		Gallon g2 = new Gallon(2);
		assertNotEquals(g2,g1);
	}

	@Test
	public void testEqualsToNull() {
		Gallon g1 = new Gallon(1);
		g1.equals(null);
		g1.equals(this);
	}

}
