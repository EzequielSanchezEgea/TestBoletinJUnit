package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FridgeTest {

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "orange"})
    void testPut(String item) {
        Fridge fridge = new Fridge();
    }

    @Test
    void testContains() {
        Fridge fridge = new Fridge();
        String item = "milk";
        assertFalse(fridge.contains(item));
        fridge.put(item);
        assertTrue(fridge.contains(item));
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "orange"})
    void testTake(String item) {
        Fridge fridge = new Fridge();
        try {
			fridge.take(item);
		} catch (NoSuchItemException e) {
			
		}
    }
}