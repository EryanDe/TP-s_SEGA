/*package dev.levenshtein;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HamcrestTest {

    @Test
    public void testStringAssertions() {
        String actual = "Hello, world!";

        // Vérifie que la chaîne contient "Hello"
        assertThat(actual, containsString("Hello"));

        // Vérifie la longueur de la chaîne
        assertThat(actual.length(), is(13));

        // Vérifie que la chaîne commence par "Hello" et finit par "world!"
        assertThat(actual, startsWith("Hello"));
        assertThat(actual, endsWith("world!"));

        // Vérifie que la chaîne ne contient pas "Goodbye"
        assertThat(actual, not(containsString("Goodbye")));
    }

    @Test
    public void testNumberAssertions() {
        int number = 10;

        // Vérifie que le nombre est égal à 10
        assertThat(number, is(10));

        // Vérifie que le nombre est supérieur à 5
        assertThat(number, greaterThan(5));

        // Vérifie que le nombre est inférieur ou égal à 10
        assertThat(number, lessThanOrEqualTo(10));

        // Vérifie que le nombre est différent de 0
        assertThat(number, not(0));
    }

    @Test
    public void testCollectionAssertions() {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        // Vérifie que la liste contient "banana"
        assertThat(fruits, hasItem("banana"));

        // Vérifie que la liste contient exactement ces éléments, peu importe l'ordre
        assertThat(fruits, containsInAnyOrder("orange", "apple", "banana"));

        // Vérifie que la liste ne contient pas "grape"
        assertThat(fruits, not(hasItem("grape")));

        // Vérifie que la liste a une taille de 3
        assertThat(fruits, hasSize(3));
    }

    @Test
    public void testMultipleAssertions() {
        String value = "Hello, world!";
        int number = 10;

        // Assertion multiple : chaîne commence par "Hello" et nombre est supérieur à 5
        assertThat("Vérifie chaîne et nombre", value, allOf(
                startsWith("Hello"),
                containsString("world")));

        // Assertion multiple : vérifie que le nombre est 10 et supérieur à 5
        assertThat("Vérifie le nombre", number, allOf(
                is(10),
                greaterThan(5)));
    }
}
*/