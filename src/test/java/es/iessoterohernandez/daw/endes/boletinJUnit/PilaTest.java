package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PilaTest {


    @Test
    public void testPop() {
        Pila pila = new Pila();
        pila.push(5);
        assertEquals(Integer.valueOf(5), pila.pop());
    }

    @Test
    public void testEmpty() {
        Pila pila = new Pila();
        assertTrue(pila.isEmpty());
    }

   
    @Test
    public void testTop() {
        Pila pila = new Pila();
        pila.push(5);
        assertEquals(Integer.valueOf(5), pila.top());
    }

    @Test
    public void testTopEmpty() {
        Pila pila = new Pila();
        assertNull(pila.top());
    }
    @Test
    public void testPopEmpty() {
        Pila pila = new Pila();
        assertNull(pila.pop());
    }

}