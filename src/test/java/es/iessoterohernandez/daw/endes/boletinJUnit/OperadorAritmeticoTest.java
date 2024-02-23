package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class OperadorAritmeticoTest {
	
	@Test
	public void testSuma() {
		 OperadorAritmetico o = new OperadorAritmetico();
		assertEquals(5, OperadorAritmetico.suma(2, 3));
	}

	@Test
	public void testDivision() throws Exception {
		assertEquals(2, OperadorAritmetico.division(6, 3));
		assertEquals(0, OperadorAritmetico.division(0, 1));
		assertEquals(-2, OperadorAritmetico.division(-6, 3));

		try {
			OperadorAritmetico.division(6, 0);
			fail("Se esperaba una excepción pero no se lanzó");
		} catch (Exception e) {
			assertTrue(e instanceof Exception);
		}

	}
}
