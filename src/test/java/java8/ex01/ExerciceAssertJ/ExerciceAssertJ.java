package java8.ex01.ExerciceAssertJ;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

import data.Data;
import data.domain.Pizza;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Assertions Hamcrest
 */
public class ExerciceAssertJ {

    @Test
    public void test_isWithAssertJ() throws Exception {
        // Création de pizzas factices pour le test
        List<Pizza> pizzas = Arrays.asList(
                new Pizza(1, "Margherita", 1200),
                new Pizza(2, "Pepperoni", 1300),
                new Pizza(3, "La Cannibale", 1500)
        );

        // Vérification si l'une des pizzas a un prix >= 1300
        boolean result = pizzas.stream().anyMatch(p -> p.getPrice() >= 1300);

        // Assertion avec AssertJ : Vérifie que result est true
        assertThat(result).isTrue();  // AssertJ vérifie que le résultat est true
    }



    @Test
    public void test_hasSize() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Valider que result a 3 éléments
        assertThat(result).hasSize(3);  // AssertJ vérifie que la taille de la liste est de 3
    }


    @Test
    public void test_hasProperty() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        Pizza result = pizzas.stream().max(Comparator.comparing(Pizza::getPrice)).orElseThrow();

        // Valider que result a la propriété name qui vaut "La Cannibale"
        assertThat(result).hasFieldOrPropertyWithValue("name", "La Cannibale");  // AssertJ vérifie la propriété "name"
    }

    @Test
    public void test_everyItem() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(toList());

        // Valider que tous les objets Pizza de la liste result ont un prix >= 1300
        assertThat(result).allMatch(p -> p.getPrice() >= 1300);  // AssertJ vérifie que chaque pizza a un prix >= 1300
    }

}
