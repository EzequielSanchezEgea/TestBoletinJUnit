package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubscripcionTest {

	private static Subscripcion subscripcion;

	@BeforeEach
	public void init() {
		subscripcion = new Subscripcion(1000, 12);
	}

	@Test
	public void testPrecioPorMes() {

		subscripcion = new Subscripcion(1200, 12);
	    assertEquals(100, subscripcion.precioPorMes(), 0.01);
	    
		subscripcion = new Subscripcion(21, 20);
		assertEquals(1.05, subscripcion.precioPorMes(), 1);

		subscripcion = new Subscripcion(1000, 0);
		assertEquals(0, subscripcion.precioPorMes(), 0);

		subscripcion = new Subscripcion(0, 12);
		assertEquals(0, subscripcion.precioPorMes(), 0);
		
		subscripcion = new Subscripcion(0, 0);
		assertEquals(0, subscripcion.precioPorMes(), 0);
		
	}

	@Test
	public void testCancel() {
		subscripcion.cancel();
		assertEquals(0, subscripcion.precioPorMes(), 0);
	}
}
