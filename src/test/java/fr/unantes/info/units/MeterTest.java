package fr.unantes.info.units;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MeterTest {

    private Meter m1 = new Meter(1);

    @Test
    public void equals() {
        assertNotEquals(m1, new Inch(1.0));

    }
    
    @Test
    public void testNotEqualsNull() {
        assertNotEquals(m1, null);
    }

    @Test
    public void testAdd() {
        Meter m0 = new Meter(0);
        assertEquals(new Meter(0), m0.add(m0));
    }

    @Test
    public void testAddMeter() {
        Meter m2 = new Meter(1);
        assertEquals(new Meter(2), m1.add(m2));
    }
    
    @Test
    public void testConvertMeters2Foot() {
        Foot foot = new Foot(1);
        Meter cm = new Meter(0.3048);
        assertEquals(cm.toFoot(), foot);
    }

    @Test
    public void testConvertMeterToInch() {
        Length i = new Inch(12);
        Meter m = new Meter(0.3048);
        assertEquals(m.toInch(), i);
    }

    @Test
    public void testEqualsMeter() {
        Meter m1 = new Meter(1);
        Meter m2 = new Meter(1);
        assertEquals(m2, m1);
    }

    @Test
    public void testNotEqualsMeter() {
        Meter m1 = new Meter(1);
        Meter m2 = new Meter(2);
        assertNotEquals(m2, m1);
    }
    
    @Test
    public void testFootNotEqualsMeter() {
        Meter m1 = new Meter(1);
        Foot f1 = new Foot(1);
        assertNotEquals(m1, f1);
    }
    
    @Test
    public void testToMeter() {
        Meter m1 = new Meter(1);
        assertEquals(new Meter(1), m1.toMeter());
    }
}