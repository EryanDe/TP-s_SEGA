package dev.levenshtein;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceLevenshteinTest {

    private DistanceLevenshtein distanceLevenshtein = new DistanceLevenshtein();

    @Test
    @Tag("validation")
    public void testNullFirstParameter() {
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance(null, "mot");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testEmptyFirstParameter() {
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("", "mot");
        });
        assertEquals("Le premier paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testNullSecondParameter() {
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", null);
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }

    @Test
    @Tag("validation")
    public void testEmptySecondParameter() {
        Exception exception = assertThrows(AppException.class, () -> {
            distanceLevenshtein.calculerDistance("mot", "");
        });
        assertEquals("Le second paramètre ne peut être null ou vide", exception.getMessage());
    }
}
