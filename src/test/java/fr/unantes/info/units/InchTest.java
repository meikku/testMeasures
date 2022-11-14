package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InchTest {

    private Inch inch1 = new Inch(1);

    @Test
    public void testGetValue() {
        assertEquals(new Inch(1).getValue(), inch1.getValue());
    }
    
    @Test
    public void equals() {
        assertEquals(inch1, inch1);
        assertNotEquals(null, inch1);
        assertNotEquals(this, inch1);
    }
    
	@Test
	public void testNotEquals() {
    	Foot f = new Foot(1);
    	Inch i = new Inch(1);
        assertNotEquals(i, f);
	}

    @Test
    public void testConvertInchToMeter() {
        inch1.toMeter();
        Meter m = new Meter(0.3048);
        assertEquals(m, inch1.toMeter());
    }

    @Test
    public void testConvertInchToFoot() {
    	Foot f = new Foot(1);
        assertEquals(f, inch1.toFoot());
    }
    
    @Test
    public void testInchToInch() {
    	Inch i = new Inch(1);
        assertEquals(i, inch1.toInch());
    }

    @Test
    public void testEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(1);
        assertEquals(i2, i1);
        assertNotEquals(null, i1);
    }

    @Test
    public void testNotEqualsInch() {
        Length i1 = new Inch(1);
        Length i2 = new Inch(2);
        assertNotEquals(i2, i1);
    }
    
    @Test
    public void test2NotEqualsInch() {
        Length i1 = new Inch(1.0);
        Length i2 = new Inch(2.0);
        assertNotEquals(i2, i1);
    }
}