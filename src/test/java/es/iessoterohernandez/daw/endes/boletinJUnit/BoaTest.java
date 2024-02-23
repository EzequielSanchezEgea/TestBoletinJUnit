package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BoaTest {

    private Boa boa;

    @BeforeEach
    public void init() {
        boa = new Boa("Bobby", 5, "granola bars");
    }

    @ParameterizedTest
    @MethodSource("healthyBoaDataProvider")
    public void testIsHealthy(String favoriteFood, boolean expected) {
        boa = new Boa("Bobby", 5, favoriteFood);
        assertEquals(expected, boa.isHealthy());
    }

    private static Stream<Arguments> healthyBoaDataProvider() {
        return Stream.of(
            arguments("granola bars", true),
            arguments("mice", false),
            arguments("fish", false)
        );
    }

    @ParameterizedTest
    @MethodSource("fitsInCageDataProvider")
    public void testFitsInCage(int cageLength, boolean expected) {
        assertEquals(expected, boa.fitsInCage(cageLength));
    }

    private static Stream<Arguments> fitsInCageDataProvider() {
        return Stream.of(
            arguments(10, true),
            arguments(5, false),
            arguments(3, false)
        );
    }
}