package punts;

import static org.junit.Assert.assertEquals;

import org.junit.*;
public class TestSegment {
	
	@Test
	public void testSegmentConstructorBasic() {
		//Comprova que el Segment pugi se creat buit
		@SuppressWarnings("unused")
		Segment s = new Segment();
	}
	
	@Test
	public void testSegmentBuit() {
		//Comprova que el Segment buit es crea correctament
		Segment s = new Segment();
		assertEquals(0, s.getX1());
		assertEquals(0, s.getY1());
		assertEquals(0, s.getX2());
		assertEquals(0, s.getY2());
	}
	
	@Test
	public void testSetX1() {
		//comprova que el metode setX1 introdueix el valor correctament
		Segment s = new Segment();
		s.setX1(12);
		assertEquals(12, s.getX1());
	}
	
	@Test
	public void testSetY1() {
		//comprova que el metode setY1 introdueix el valor correctament
		Segment s = new Segment();
		s.setY1(11);
		assertEquals(11, s.getY1());
	}
	
	@Test
	public void testSetX2() {
		//comprova que el metode setX2 introdueix el valor correctament
		Segment s = new Segment();
		s.setX2(22);
		assertEquals(22, s.getX2());
	}
	
	@Test
	public void testSetY2() {
		//comprova que el metode setY2 introdueix el valor correctament
		Segment s = new Segment();
		s.setY2(33);
		assertEquals(33, s.getY2());
	}
	
	@Test
	public void testSegmentConstructorPunts() {
		//Comprova que el Segment es crea donant li dos punts
		Punt p1 = new Punt(1, 2);
		Punt p2 = new Punt(3, 4);
		Segment s = new Segment(p1, p2);
		assertEquals(1, s.getX1());
		assertEquals(2, s.getY1());
		assertEquals(3, s.getX2());
		assertEquals(4, s.getY2());
	}
	
	@Test
	public void testSegmentLongitud() {
		//comprova que el metode longitud funcioni correctament
		Punt p1 = new Punt(2, 4);
		Punt p2 = new Punt(4, 6);
		Segment s = new Segment(p1, p2);
		long longitud = (long)s.longitud();
		assertEquals(2, longitud);
	}
	
	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestSegment");
    }
}
