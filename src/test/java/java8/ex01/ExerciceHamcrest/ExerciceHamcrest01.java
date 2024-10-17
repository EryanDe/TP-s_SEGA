package java8.ex01.ExerciceHamcrest;

import data.Data;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import data.domain.Pizza;

public class ExerciceHamcrest01 {

    @Test
    public void test_is() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // Vérifier si l'une des pizzas a un prix >= 1300
        boolean result = pizzas.stream().anyMatch(p -> p.getPrice() >= 1300);

        // Valider que result vaut true
        assertThat(result, is(true));  // Hamcrest valide que le résultat est "true"
    }

    @Test
    public void test_hasSize() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // Filtrer les pizzas avec un prix >= 1300
        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(Collectors.toList());

        // Valider que result a 3 éléments
        assertThat(result, hasSize(3));  // Hamcrest vérifie que la taille est de 3
    }

    @Test
    public void test_hasProperty() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // Trouver la pizza la plus chère
        Pizza result = pizzas.stream()
                .max(Comparator.comparing(Pizza::getPrice))
                .orElseThrow();

        // Valider que result a la propriété "name" qui vaut "La Cannibale"
        assertThat(result, hasProperty("name", equalTo("La Cannibale")));  // Hamcrest vérifie la propriété "name"
    }

    @Test
    public void test_everyItem() throws Exception {
        List<Pizza> pizzas = new Data().getPizzas();

        // Filtrer les pizzas avec un prix >= 1300
        List<Pizza> result = pizzas.stream()
                .filter(p -> p.getPrice() >= 1300)
                .collect(Collectors.toList());

        // Valider que tous les objets Pizza de la liste result ont un prix >= 1300
        assertThat(result, everyItem(hasProperty("price", greaterThanOrEqualTo(1300))));  // Hamcrest vérifie que chaque pizza a un prix >= 1300
    }
}
